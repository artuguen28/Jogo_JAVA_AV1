package projeto_teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {
	static final int SIZE = 10;

	public static void main(String[] args) throws Exception {
		
		List<String> names = new ArrayList<>();
		
		String name = "";
		for(int i = 0; i < SIZE; i++) {
			
			name = JOptionPane.showInputDialog(null,"Insira o nome:");
			names.add(name);
		}
		
		Random random = new Random();
		int randomIndex = random.nextInt(SIZE);
		
		String randomName = names.get(randomIndex);
		JOptionPane.showMessageDialog(null, "Nome do aluno ganhador: " + randomName);
		
		}
}