package br.com.youtube.java.maratona.classe.test;

import br.com.youtube.java.maratona.classe.Calculadora;

public class CalculadoraTest {
	public static void main (String[] args) {
		Calculadora calc = new Calculadora();
		calc.somaDoisNumeros();		
		calc.subtraiDoisNumeros();
		
		        //tipos diferentes, d=double ou coloca o numero com ponto e tira o d; e 3 tipo inteiro
		calc.multiplicaDoisNumeros(5d, 3);//var ref cal, chama esse metodo e coloca os numeros nas variaveis -> 5 e 2 são args
		calc.dividirDoisNumeros(2.2, 2);//não imprimi apenas retorna;
		System.out.println(calc.dividirDoisNumeros(2.2, 2));//imprimi o retorno
		double result = calc.dividirDoisNumeros(2.2, 2);//cria uma var aux
		System.out.println(result);//imprimi a var aux
		System.out.println(calc.dividirDoisNumerosEx(4.2, 2));//como o retorno é inteiro não mostra o result decimal
		System.out.println(calc.dividirNumero(2, 0));//se colocar 0 em num2, return=0;
		
	}
	
}
