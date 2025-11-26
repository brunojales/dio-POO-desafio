package br.com.dio.desafio.dominio;

public abstract class Conteudo {

	//Public - todos tem acesso
	//private - só a classe conteudo tem acesso
	//protected - só as classes filho tem acesso
	
	//static - vai me deixar usar a constante fora da classe conteudo
	//final - o valor não pode ser altarado
	//Abstract - não consiguimos estanciar uma objeto do tipo conteudo
	
	protected static final double xpPadrao = 10d;
	
	private String titulo;
	private String descricao;
	
	public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static double getXppadrao() {
		return xpPadrao;
	}
	
	
	
	
}
