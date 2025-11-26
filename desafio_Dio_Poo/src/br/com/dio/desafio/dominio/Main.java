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
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);*/

		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcampo Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devBruno = new Dev();
		devBruno.setNome("Bruno Jales");
		devBruno.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos incritos Bruno " +devBruno.getConteudosInscritos());
		
		devBruno.progredir();
		devBruno.progredir();
		System.out.println("-----");
		System.out.println("Conteúdos incritos Bruno " +devBruno.getConteudosInscritos());
		System.out.println("Conteúdos concluidos Bruno " +devBruno.getConteudosConcluidos());
		System.out.println("XP: "+devBruno.calcularTotalXp());
		
		System.out.println("-------------------------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao Cardoso");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos incritos João " +devJoao.getConteudosInscritos());
		
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-----");
		System.out.println("Conteúdos incritos João " +devJoao.getConteudosInscritos());
		System.out.println("Conteúdos concluidos João " +devJoao.getConteudosConcluidos());
		System.out.println("XP: "+devJoao.calcularTotalXp());
		
	}

}
