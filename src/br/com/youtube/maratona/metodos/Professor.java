package br.com.youtube.maratona.metodos;

public class Professor {
	public String nome;
	public String matricula;  //verificar se sao apenas numeros ou tem letras 
	public String rg;
	public String cpf;
	
	//aux = var do tipo referencia que esperea um objeto do tipo Professor
	public void imprimir(Professor aux) {
		System.out.println("---------------");
		System.out.println(aux.cpf);
		System.out.println(aux.rg);
		System.out.println(aux.nome);
		System.out.println(aux.matricula);
	}
}
