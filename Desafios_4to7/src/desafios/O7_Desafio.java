package desafios;

public class O7_Desafio {

	public static void main(String[] args) {
		
		String yoda[] = {"a","vida", "é", "bela"};
		
		for (int x = 3; x > -1; x--) {
			
			System.out.print(x == 0? yoda[x].toUpperCase() + ".":yoda[x].toUpperCase() + " ");
			
		}
		
	}

}
