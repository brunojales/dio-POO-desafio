package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("BootCamp");
		curso1.setCargahoraria(20);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("BootCamp");
		curso2.setCargahoraria(10);
		
		Conteudo conteudo = new Curso(); //Polimorfismo
		Conteudo conteudo1 = new Mentoria(); //Polimorfismo
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("BootCamp");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		System.out.println(mentoria1);

	}

}
