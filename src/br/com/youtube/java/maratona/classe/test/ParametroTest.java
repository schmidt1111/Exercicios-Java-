package br.com.youtube.java.maratona.classe.test;

import br.com.youtube.java.maratona.classe.Parametro;

public class ParametroTest {
	public static void main(String[] args) {
		Parametro calc = new Parametro();
		int num1=5;
		int num2=10;
		calc.alterarDoisNumeros(num1, num2);
		System.out.println("Dentro do Teste.");
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
	}
}
