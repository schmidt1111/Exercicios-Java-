package br.com.youtube.java.maratona;

public class ImprimindoVariaveis {

	public static void main(String[] args) {
		float numeroFracionario1 = 32;
		double numeroFracionario2 = 64;
		byte numeroInteiro1 = 8;
		short numeroInteiro2 = 16;
		int numeroInteiro3 = 32;
		long numeroInteiro4 = 64;
		boolean logico1 = true;
		boolean logico2 = false;
		String conjuntoCaracter = "Alfanumericos";
		char umCaracter = 'S'; // 2bits valor exadecimal começando com contra barra - tabela unicode

		System.out.println("Dados impressos!");
		System.out.println(numeroFracionario1 + " bits IEE 754 floating point");
		System.out.println(numeroFracionario2 + " bits IEE 754 floating point");
		System.out.println(numeroInteiro1 + " bits");
		System.out.println(numeroInteiro2 + " bits");
		System.out.println(numeroInteiro3 + " bits");
		System.out.println(numeroInteiro4 + " bits");
		System.out.println(logico1 + " = 8 bits");
		System.out.println(logico2 + " = 8 bits");
		System.out.println(conjuntoCaracter + " = cada char tem 16 bits");
		System.out.println(umCaracter + " = um caracter = 16 bits");
	}
}
