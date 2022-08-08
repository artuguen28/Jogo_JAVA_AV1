package pp;

import java.util.Random;

public class Player {
	
	Random random = new Random();
	public String direct = "";
	private int x_pos;
	private int y_pos;
	private int dir = 2;

	public void playerMove(int comand) {
		
		switch (comand) {
			case 6:
				direct = "Right";
				if (x_pos >= 9) x_pos = 9;
				else x_pos ++;
				dir = 6;
				break;
			case 8:
				direct = "Up";
				if (y_pos <= 0) y_pos = 0;
				else y_pos --;
				dir = 8;
				break;
			case 4:
				direct = "Left";
				if (x_pos <= 0) x_pos = 0;
				else x_pos --;
				dir = 4;
				break;
			case 2:
				direct = "Down";
				if (y_pos >= 9) y_pos = 9;
				else y_pos ++;
				dir = 2;
				break;
			default:
				direct = "";
				break;
		}
		System.out.println("Direction: " + direct);
	}
	
	public boolean shoot(int x_enemy, int y_enemy, int direct) {
		
		switch (direct) {
			case 6:
				System.out.print("6");
				if ( x_pos < x_enemy && (y_pos == y_enemy ||  y_pos == (y_enemy + 1) || y_pos == (y_enemy - 1))) {
					System.out.print("\n");
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
				return true;
					//TimeUnit.SECONDS.sleep(1);
				} else {
					return false;
				}
		case 8:
				System.out.print("8");
				if ( y_pos > y_enemy && (x_pos == x_enemy ||  x_pos == (x_enemy + 1) || x_pos == (x_enemy - 1))) {
					System.out.print("\n");
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
				return true;
					//TimeUnit.SECONDS.sleep(1);
				} else {
					return false;
				}
				
			case 4:
				System.out.print("4");
				if ( x_pos > x_enemy && (y_pos == y_enemy ||  y_pos == (y_enemy + 1) || y_pos == (y_enemy - 1))) {
					System.out.print("\n");
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
				return true;
					//TimeUnit.SECONDS.sleep(1);
				} else {
					return false;
				}

				
			case 2:
				System.out.print("2");
				if ( y_pos < y_enemy && (x_pos == x_enemy ||  x_pos == (x_enemy + 1) || x_pos == (x_enemy - 1))) {
					System.out.print("\n");
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
				return true;
					//TimeUnit.SECONDS.sleep(1);
				} else {
					return false;
				}
			
			default:
				return false;
		}
	}
	public boolean colision(int x_enemy, int y_enemy) {
		if((x_pos == (x_enemy + 1) &&  y_pos == (y_enemy + 1)) || (x_pos == (x_enemy - 1) && (y_pos == (y_enemy - 1)))) {
			return true;
		}
		else return false;
	}
	
	public void updateXY() {
		this.x_pos = random.nextInt(10);
		this.y_pos = random.nextInt(10);
	}


	public int getX_pos() {
		return x_pos;
	}


	public int getY_pos() {
		return y_pos;
	}
	


}
