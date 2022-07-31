package pp;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int x = 1;
		int vidas = 5;
		int enemy_hp = 100;
		int turno = 0;
		int player_x = 6, player_y = 3;
		Enemie enem = new Enemie();
		
		while(x != 0) {
			Screen sc = new Screen(vidas, enemy_hp, x, turno, enem.getY_pos(), enem.getX_pos(), player_x, player_y);
			sc.showScreen();
			turno ++;
			enem.enemieMove();
			Scanner in = new Scanner(System.in);
			x = in.nextInt();
		}
		
		System.out.print("You left the game!");

	}
}