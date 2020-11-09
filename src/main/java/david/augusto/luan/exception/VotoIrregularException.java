package david.augusto.luan.exception;

public class VotoIrregularException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public VotoIrregularException(int numeroCandidato) {
		super("Operação não realizada, candidato com o numero " + numeroCandidato + " não existe.");
	}

}
