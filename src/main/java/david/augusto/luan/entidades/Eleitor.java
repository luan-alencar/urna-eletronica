package david.augusto.luan.entidades;

public class Eleitor {

	private String nome;
	private String titulo;
	private boolean votou;

	public Eleitor(String nome, String titulo) {
		this.nome = nome;
		this.titulo = titulo;
		this.votou = false;
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

	public boolean isVotou() {
		return votou;
	}

	public void setVotou(boolean votou) {
		this.votou = votou;
	}
	
	

}