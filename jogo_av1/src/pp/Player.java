package pp;

import java.util.Random;

public class Player {
	
	public String direct = "";
	protected int x_pos;
	protected int y_pos;

	public void playerMove(int comand) {
		
		switch (comand) {
			case 6:
				direct = "Right";
				x_pos++;
				break;
			case 8:
				direct = "Up";
				y_pos--;
				break;
			case 4:
				direct = "Left";
				x_pos--;
				break;
			case 2:
				direct = "Down";
				y_pos++;
				break;
			default:
				direct = "";
				break;
		}
		System.out.println("Direction: " + direct);
	}

	public int getX_pos() {
		return x_pos;
	}


	public int getY_pos() {
		return y_pos;
	}


}
