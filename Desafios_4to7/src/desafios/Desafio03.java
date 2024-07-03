package desafios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Desafio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um Texto abaixo e direi quantas palavras tem.");
		String texto = entrada.nextLine();
		StringTokenizer str = new StringTokenizer(texto);
		int resultado = str.countTokens();
		System.out.printf("A quantidade de palavras na frase: \n'%s' \nÉ de: %d.", texto, resultado);
	}

}
