package br.com.youtube.java.maratona.classe.test;

import br.com.youtube.java.maratona.classe.Professor;

public class ProfessorTest {
	public static void main (String[] args) {
		Professor professor1 = new Professor();
		professor1.nome = "Ana Maria";
		professor1.matricula = "123.123";
		professor1.rg = "12.123.123-1";
		professor1.cpf = "123.123.123.12";
		
		Professor professor2 = new Professor();
		professor2.nome = "Ana Maria";
		professor2.matricula = "123.123";
		professor2.rg = "12.123.123-1";
		professor2.cpf = "123.123.123.12";
		
		//vc elimina todos os dados do prof.2 que será igual a prof.1
		//professor1 = professor2; 
				
		System.out.println("Nome = "+ professor1.nome);
		System.out.println("Matricula = "+ professor1.matricula);
		System.out.println("RG = "+ professor1.rg);
		System.out.println("CPF = "+ professor1.cpf);
		System.out.println("---------------------------------------");
		
		System.out.println("Nome = "+ professor2.nome);
		System.out.println("Matricula = "+ professor2.matricula);
		System.out.println("RG = "+ professor2.rg);
		System.out.println("CPF = "+ professor2.cpf);
		
	}

}
