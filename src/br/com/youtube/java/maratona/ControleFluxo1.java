package br.com.youtube.java.maratona;

//Exemplo do comando if/ else if/ else
//IOException = classe de excess�o
import java.io.IOException;

public class ControleFluxo1 {
	public static void main(String[] args) throws IOException {
		System.out.println("Digite uma das palavras JAVA:");
		int numero = System.in.read(); // l� do teclado apenas um caractere

		if (((char) numero == 'J') || ((char) numero == 'j') || ((char) numero == 'A') || ((char) numero == 'a')
				|| ((char) numero == 'V') || ((char) numero == 'v')) {
			System.out.println("Letra digitada est� correta.");
		} else if ((char) numero == (char) 13) { // verifica se o usuario digitou a techa <enter> =13 na tabela ASCII
			System.out.println("Foi digitado apenas um <enter>."); // e envia uma mensagem
		} else {
			System.out.println("Letra digitada est� incorreta.");
		}
	}
}
