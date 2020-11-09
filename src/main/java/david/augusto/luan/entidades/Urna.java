package david.augusto.luan.entidades;

import java.util.ArrayList;
import java.util.List;


public class Urna {

//	private Candidato[] candidatos;
	private List<Candidato> candidatos;
	private List<Eleitor> eleitores;

	public Urna(/* int qtdCandidatos */) {
//		this.candidatos = Candidato[int qtdCandidatos];
		this.candidatos = new ArrayList<>();
		this.eleitores = new ArrayList<>();
	}

	public void cadastrarCandidatos(Candidato candidato) {
		this.candidatos.add(candidato);
	}

	public void cadastrarEleitor(Eleitor eleitor) {
		this.eleitores.add(eleitor);
	}

	public Candidato getCandidato(int numero) {
		Candidato can = null;
		for (Candidato c : candidatos) {
			if (c.getNumero() == numero) {
				can = c;
			}
		}
		return can;
	}

	public boolean podeVotar() {
		return true;
	}

	public void votar(Eleitor tituloEleitor, Candidato numeroCandidato) {

	}

	public Candidato getVencedor() {
		return null;
	}

	public void exibirApuracao() {

	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

	public List<Eleitor> getEleitores() {
		return eleitores;
	}

	public void setEleitores(List<Eleitor> eleitores) {
		this.eleitores = eleitores;
	}

	public static void main(String[] args) {

		// candidatos
		Candidato c1 = new Candidato("Zezin", 1);
		Candidato c2 = new Candidato("Pelé", 2);
		Candidato c3 = new Candidato("TIco", 3);

		// eleitores
		Eleitor e1 = new Eleitor("Luan", "1234");
		Eleitor e2 = new Eleitor("Laissa", "123");
		Eleitor e3 = new Eleitor("Livia", "4321");

		// urna
		Urna u = new Urna();

		// cadastrando cadidatos
		u.cadastrarCandidatos(c1);
		u.cadastrarCandidatos(c2);
		u.cadastrarCandidatos(c3);

		// cadastrando eleitores
		u.cadastrarEleitor(e1);
		u.cadastrarEleitor(e2);
		u.cadastrarEleitor(e3);
		
		Candidato c = u.getCandidato(2);
		System.out.println(c);
	}

}