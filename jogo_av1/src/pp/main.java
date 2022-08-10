package pp;

import java.util.Random;
import java.util.Scanner;
//import java.util.concurrent.TimeUnit;

public class main {

	public static void main(String[] args) {
		
		Random random = new Random();
		int x_pos = random.nextInt(10);
		int comand = 1;
		int comand_1 = 0;
		int vidas = 5;
		int enemy_hp = 100;
		int turno = 0;
		int player_x = 6, player_y = 3;
		int dir = 0;
		Enemie enem = new Enemie();
		Player play = new Player();
		
		while(comand != 0) {
			Screen sc = new Screen(vidas, enemy_hp, comand, turno, enem.getY_pos(), enem.getX_pos(), play.getX_pos(), play.getY_pos());
			System.out.print("X do player: "+ play.getX_pos() + "\n");
			System.out.print("Y do player: "+ play.getY_pos() + "\n");
			System.out.print("X do enemy: "+ enem.getX_pos() + "\n");
			System.out.print("Y do enemy: "+ enem.getY_pos() + "\n");
			sc.showScreen();
			turno ++;
			Scanner in = new Scanner(System.in);
			
			
			if(play.colision(enem.getX_pos(), enem.getY_pos())) {
				vidas = vidas - 1;
				enem.updateXY();
				play.updateXY();
				
			}
			
			else
			{
				comand = in.nextInt();
				if (comand == 2 || comand == 6  || comand == 8 || comand == 4) {
					play.playerMove(comand);
					
				} else if (comand == 5) {
					System.out.print("Shooting direction");
					Scanner s = new Scanner(System.in);
					dir = s.nextInt();
					if(play.shoot(enem.getX_pos(), enem.getY_pos(), dir)) {
						enemy_hp = enemy_hp - 10;
						enem.updateXY();
						play.updateXY();
						
					}
				}
				enem.enemieMove();
			}
			
			
			if(vidas == 0) {
				System.out.println("VocÊ perdeu!");
				System.out.println("Aperte 1 para recomeçar.");
				System.out.println("Aperte 0 para sair do jogo.");
				comand = in.nextInt();
				if (comand == 0)
				{
					break;
				}
				else if (comand == 1)
				{
					vidas++;
					enemy_hp = 100;
					continue;
				}
				
			}
			
			 if(enemy_hp == 0)
			 {
				 System.out.println("Você ganhou!");
				 System.out.println("Aperte 1 para recomeçar.");
				 System.out.println("Aperte 0 para sair do jogo.");
				 comand = in.nextInt();
				if (comand == 0)
				{
					break;
				}
				else if (comand == 1)
				{
					vidas = 5;
					enemy_hp = 100;
					continue;
				}
			 }
			
			
		}
		
		System.out.print("Obrigado por jogar!!!");

	}
}