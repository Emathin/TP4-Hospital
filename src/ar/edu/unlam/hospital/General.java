package ar.edu.unlam.hospital;

import java.util.Set;

public class General extends Paciente {

	public General(String nombreDePaciente, Integer dni) {
		super(nombreDePaciente, dni);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Boolean puedeComer(Set<String> losIngredientes, Elaboracion elaboracion) {
		return true;
	}

}
