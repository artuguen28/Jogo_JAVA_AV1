package pp;

import java.util.Random;

public class Enemie {
	
	Random random = new Random();
	private String direct = "";
	private int x_pos = random.nextInt(10);
	private int y_pos = random.nextInt(6);

	
	public void enemieMove() {
		
		int randomInt = random.nextInt(4);
		
		switch (randomInt) {
			case 0:
				direct = "Right";
				if (x_pos >= 9) x_pos = 9;
				else x_pos ++;
				break;
			case 1:
				direct = "Up";
				if (y_pos <= 0) y_pos = 0;
				else y_pos --;
				break;
			case 2:
				direct = "Left";
				if (x_pos <= 0) x_pos = 0;
				else x_pos --;
				break;
			case 3:
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

	public void updateXY() {
		this.x_pos = random.nextInt(10);
		this.y_pos = random.nextInt(6);
	}

	public int getX_pos() {
		return x_pos;
	}


	public int getY_pos() {
		return y_pos;
	}


}
