package pp;

import java.util.concurrent.TimeUnit;

public class Player {
	
	public String direct = "";
	private int x_pos;
	private int y_pos;

	public void playerMove(int comand) {
		
		switch (comand) {
			case 6:
				direct = "Right";
				if (x_pos >= 9) x_pos = 9;
				else x_pos ++;
				break;
			case 8:
				direct = "Up";
				if (y_pos <= 0) y_pos = 0;
				else y_pos --;
				break;
			case 4:
				direct = "Left";
				if (x_pos <= 0) x_pos = 0;
				else x_pos --;
				break;
			case 2:
				direct = "Down";
				if (y_pos >= 9) y_pos = 9;
				else y_pos ++;
				break;
			default:
				direct = "";
				break;
		}
		System.out.println("Direction: " + direct);
	}
	
	public void shoot(int x_enemy, int y_enemy, int direct) {
		
		switch (direct) {
			case 6:
				if (y_pos == y_enemy && x_pos < x_enemy) {
					for(int i=0; i< 10; i++){
						for(int j=0; j< 10; j++) {
							
							if (i == y_enemy && j == x_enemy){
								System.out.print(" X|");
								
							} else if  (i == y_pos && j == x_pos){
								System.out.print("{°}");
								
							} else {
								System.out.print(" _|");
							}
						}
						System.out.print("\n");
					}
					TimeUnit.SECONDS.sleep(1);
				} else System.out.println("Missed!");
				break;
				
			case 8:
				if (x_pos == x_enemy && y_pos > y_enemy) {
					for(int i=0; i< 10; i++){
						for(int j=0; j< 10; j++) {
							
							if (i == y_enemy && j == x_enemy){
								System.out.print(" X|");
								
							} else if  (i == y_pos && j == x_pos){
								System.out.print("{°}");
								
							} else {
								System.out.print(" _|");
							}
						}
						System.out.print("\n");
					}	
					TimeUnit.SECONDS.sleep(1);
				} else System.out.println("Missed!");
				break;
				
			case 4:
				if (y_pos == y_enemy && x_pos > x_enemy) {
					for(int i=0; i< 10; i++){
						for(int j=0; j< 10; j++) {
							
							if (i == y_enemy && j == x_enemy){
								System.out.print(" X|");
								
							} else if  (i == y_pos && j == x_pos){
								System.out.print("{°}");
								
							} else {
								System.out.print(" _|");
							}
						}
						System.out.print("\n");
					}
					TimeUnit.SECONDS.sleep(1);
				} else System.out.println("Missed!");
				break;
				
			case 2:
				if (x_pos == x_enemy && y_pos > y_enemy) {
					for(int i=0; i< 10; i++){
						for(int j=0; j< 10; j++) {
							
							if (i == y_enemy && j == x_enemy){
								System.out.print(" X|");
								
							} else if  (i == y_pos && j == x_pos){
								System.out.print("{°}");
								
							} else {
								System.out.print(" _|");
							}
						}
						System.out.print("\n");
					}
					TimeUnit.SECONDS.sleep(1);
				} else System.out.println("Missed!");
				break;
			
			default:
				System.out.println("Missed!");		
		}
	}

	public int getX_pos() {
		return x_pos;
	}


	public int getY_pos() {
		return y_pos;
	}


}
