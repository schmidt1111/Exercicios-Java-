package br.com.youtube.java.maratona.classe;

public class Calculadora {
	public void somaDoisNumeros() {
		System.out.println(5+5); //definindo numero no codigo
	}
	
	public void subtraiDoisNumeros() {
		System.out.println(5-5);   //definindo numero no codigo
	}
	
	//metodo passando parametros
	public void multiplicaDoisNumeros(double num1, int num2) {  //(definindo o tipo da variavel local no parametro)
		System.out.println(num1*num2);		
	}
	//metodo retornando valor
	public double dividirDoisNumeros(double num1, double num2) {
		return num1/num2;   //retornando direto sem auxiliar
		/*
		double resultado = num1/num2;  //criando var auxiliar
		return resultado;*/
	}
	//metodo mudando o tipo da var de retorno
	public int dividirDoisNumerosEx(double num1, double num2) {
		return (int) ((int)num1/num2); //cast do valor double para int
	}
	
	//condicao if com return
	public double dividirNumero(double num1, double num2) {
		if (num2!=0) {
			return(num1/num2);
		}
		return 0;
	}
	//igual o de cima mais de maneira diferente
	public void dividirNum (double num1, double num2) {
		if (num2!=0) {
			System.out.println(num1/num2);
			return;
		}
		System.out.println("Não é possivel dividir por 0");
	}
}
