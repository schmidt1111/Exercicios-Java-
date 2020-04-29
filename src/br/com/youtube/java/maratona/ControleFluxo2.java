package br.com.youtube.java.maratona;

//exemplo de ControleFluxo1 usando Switch
import java.io.IOException;

public class ControleFluxo2 {
	public static void main(String[] args) throws IOException {
		System.out.println("Digite uma das letras da palavra Java:");
		int numero = System.in.read(); // lê do teclado apenas um caractere

		switch ((char) numero) {
		case 'J':
		case 'j':
		case 'A':
		case 'a':
		case 'V':
		case 'v':
			System.out.println("Letra digitada está correta.");
			break;
		case (char) 13: // utilizado para tratar o enter
			System.out.println("Foi digitado apenas um <enter>.");
			break;
		default:
			System.out.println("Letra digitada está incorreta.");
		}
	}
}
