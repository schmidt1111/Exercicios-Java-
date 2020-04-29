package br.com.youtube.java.maratona.classe.test;

import br.com.youtube.java.maratona.classe.Estudante;

public class EstudanteTest {
	public static void main (String[] args) {
		Estudante aluno1 = new Estudante();   //estudante 1 variavel de referencia;
		aluno1.nome = "João";
		aluno1.matricula = "1111";
		aluno1.idade = 20;
		//fazer chamadas aos atributos do objeto aluno1
		System.out.println(aluno1.nome);
		System.out.println(aluno1.matricula);
		System.out.println(aluno1.idade);
	}
}
