package pp;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int comand = 1;
		int vidas = 5;
		int enemy_hp = 100;
		int turno = 0;
		int player_x = 6, player_y = 3;
		Enemie enem = new Enemie();
		Player play = new Player();
		
		while(comand != 0) {
			Screen sc = new Screen(vidas, enemy_hp, comand, turno, enem.getY_pos(), enem.getX_pos(), play.getX_pos(), play.getY_pos());
			sc.showScreen();
			turno ++;
			enem.enemieMove();
			Scanner in = new Scanner(System.in);
			comand = in.nextInt();
			play.playerMove(comand);
		}
		
		System.out.print("You left the game!");

	}
}