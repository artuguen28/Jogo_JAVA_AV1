package pp;

import java.util.Random;

public class Enemie {
	
	Random random = new Random();
	private String direct = "";
	private int x_pos = 8;
	private int y_pos = 8;

	
	public void enemieMove() {
		
		int randomInt = random.nextInt(4);
		
		switch (randomInt) {
			case 0:
				direct = "Right";
				if (x_pos >= 8) x_pos = 8;
				else x_pos ++;
				break;
			case 1:
				direct = "Up";
				if (y_pos <= 1) y_pos = 1;
				else y_pos --;
				break;
			case 2:
				direct = "Left";
				if (x_pos <= 1) x_pos = 1;
				else x_pos --;
				break;
			case 3:
				direct = "Down";
				if (y_pos >= 8) y_pos = 8;
				else y_pos ++;
				break;
			default:
				direct = "";
				break;
		}
		System.out.println("Direction: " + direct);
	}

	public void updateXY() {
		
		int randomInt = random.nextInt(4);
		
		switch (randomInt) {
			case 0:
				this.x_pos = 1;
				this.y_pos = 1;
				break;
				
			case 1:
				this.x_pos = 8;
				this.y_pos = 1;
				break;
			case 2:
				this.x_pos = 8;
				this.y_pos = 8;
				break;
			case 3:
				this.x_pos = 1;
				this.y_pos = 8;
				break;
			default:
				break;
		}
	}

	public int getX_pos() {
		return x_pos;
	}


	public int getY_pos() {
		return y_pos;
	}


}
