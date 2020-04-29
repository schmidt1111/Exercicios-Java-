package br.com.youtube.maratona.metodos;
import br.com.youtube.maratona.metodos.Professor;

public class ProfessorTeste {
	public static void main(String[]args) {
		Professor prof1 = new Professor();
		prof1.cpf = "999.999.999-99";
		prof1.matricula = "98798";
		prof1.rg = "99.999.999-9";
		prof1.nome = "Henriqueta Maria";
		
		Professor prof2 = new Professor();
		prof2.cpf = "888.888.888-88";
		prof2.matricula = "88888";
		prof2.rg = "88.888.888-8";
		prof2.nome = "Maria Henriqueta";
		
		prof1.imprimir (prof1);
		prof2.imprimir(prof2);
		
		
	}
}
