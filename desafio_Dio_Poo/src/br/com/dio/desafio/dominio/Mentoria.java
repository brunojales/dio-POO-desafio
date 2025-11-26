package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;
	
	@Override
	public double calcularXp() {
		return xpPadrao + 10d;
	}
	
	public Mentoria() {	//Construtor sem paramentros
	}
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() { //To String
		return "Mentoria [titulo=" + getTitulo() + ", "
				+ "descricao=" + getDescricao() + ", "
						+ "data=" + data + "]";
	}

}
