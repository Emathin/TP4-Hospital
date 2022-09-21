package ar.edu.unlam.hospital;

public class Diabetico1InsulinoDependiente extends Diabetico {

	private Boolean insulinaDiariaRecibida;

	public Diabetico1InsulinoDependiente(String nombreDePaciente, Integer dni) {
		super(nombreDePaciente, dni);
		this.insulinaDiariaRecibida = false;
	}

	public void darInsulina() {
		if (this.insulinaDiariaRecibida == false)
			this.insulinaDiariaRecibida = true;
	}

}
