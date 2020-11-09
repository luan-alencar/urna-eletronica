package david.augusto.luan.entidades;

public class Eleitor {

	private String nome;
	private String titulo;

	public Eleitor(String nome, String titulo) {
		this.nome = nome;
		this.titulo = titulo;
	}

	public Eleitor() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}