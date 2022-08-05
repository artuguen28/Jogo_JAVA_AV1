package pp;

public class Screen{
		
	private int vidas;
	private int enemy_hp;
	private int x;
	private int i;
	private int j;
	private int turno;
	private int enemy_x, enemy_y;
	private int player_x, player_y;
	
	Screen(int vidas, int enemy_hp, int x, int turno, int enemy_y, int enemy_x, int player_x, int player_y) {
		
		this.vidas = vidas;
		this.enemy_hp = enemy_hp;
		this.x = x;
		this.turno = turno;
		this.enemy_x = enemy_x;
		this.enemy_y = enemy_y;
		this.player_x = player_x;
		this.player_y = player_y;
		
	}

	public void showScreen(){
		
		System.out.print("\n\n\n");
		
		System.out.println("Player <3: [" + vidas + "] | Enemy HP: [" + enemy_hp + "]");
		
		System.out.print("\n");
		
		for(i=0; i< 10; i++){
			for(j=0; j< 10; j++) {
				
				if (i == enemy_y && j == enemy_x){
					System.out.print(".v.");
					
				} else if  (i == player_y && j == player_x){
					System.out.print("{°}");
					
				} else {
					System.out.print(" _|");
				}
			}
			System.out.print("\n");
			
		}

		System.out.print("\n");
		System.out.println("Turno: " + turno);
		System.out.print("\n");
		System.out.println("GAME CONTROLS: ");
		System.out.println(" ___________");
		System.out.println("|           |");
		System.out.println("|     ^     |");
		System.out.println("|     8     |");
		System.out.println("|< 4     6 >|");
		System.out.println("|     2     |");
		System.out.println("|     v     |");
		System.out.println("|___________|");
		System.out.println("\nCoord do player: x = "+player_x);
		System.out.println("Coord do player: y = "+player_y);
		System.out.println("\nCoord do enemy: x ="+enemy_x);
		System.out.println("Coord do enemy: y = "+enemy_y);
		
		
	}
	
}
