package desafios;

import java.util.Scanner;

public class Desafio05 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um Texto abaixo e eu gritarei esse texto.");
		String texto = entrada.nextLine();
		System.out.println(texto.toUpperCase());
		
	}
	
}
