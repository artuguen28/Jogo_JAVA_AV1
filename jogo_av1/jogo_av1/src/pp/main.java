package pp;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int comand = 1;
		int vidas = 5;
		int enemy_hp = 100;
		int turno = 0;
		int player_x = 6, player_y = 3;
		int dir = 0;
		Enemie enem = new Enemie();
		Player play = new Player();
		
		while(comand != 0) {
			Screen sc = new Screen(vidas, enemy_hp, comand, turno, enem.getY_pos(), enem.getX_pos(), play.getX_pos(), play.getY_pos());
			sc.showScreen();
			turno ++;
			enem.enemieMove();
			Scanner in = new Scanner(System.in);
			comand = in.nextInt();
			if (comand == 2 || comand == 6  || comand == 8 || comand == 4) {
				
				play.playerMove(comand);
			} else if (comand == 5) {
				System.out.print("Shooting direction");
				Scanner s = new Scanner(System.in);
				dir = s.nextInt();
				play.shoot(enem.getX_pos(), enem.getY_pos(), dir);
			}
		}
		
		System.out.print("You left the game!");

	}
}