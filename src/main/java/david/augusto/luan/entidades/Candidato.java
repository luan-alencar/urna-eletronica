package david.augusto.luan.entidades;

public class Candidato {

	private String nome;
	private int numero;
	private int votos;

	public Candidato(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.votos = 0;
	}

	public Candidato() {
	}

	public void votar() {
		// incrementando o voto cada vez que um noov voto surgir
		this.votos++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}

}