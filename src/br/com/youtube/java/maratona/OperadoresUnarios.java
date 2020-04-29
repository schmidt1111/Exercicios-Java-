package br.com.youtube.java.maratona;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 20;
		int var3 = 0;
		var3 = var1 + var2;
		System.out.println("var3:" + var3);// imprimi 30
		// apos a execução do operador = sera executado o operador ++ da variavel var1
		var3 = ((var1++) + var2); // var1 vai valer 11 após a execução do operador =
		System.out.println("var3:" + (var3));// imprimi 30
		var3 = var1 + var2;
		System.out.println("var3:" + var3);// imprimi 31
		var3 = (var1 + (--var2));
		System.out.println("var3:" + var3);// imprimi 30

	}
}
