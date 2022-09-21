package ar.edu.unlam.hospital;

import java.util.Set;

public abstract class Diabetico extends Paciente {

	public Diabetico(String nombreDePaciente, Integer dni) {
		super(nombreDePaciente, dni);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Boolean puedeComer(Set<String> losIngredientes, Elaboracion elaboracion) {
		for (String string : losIngredientes) {
			if (string.equals("azucar"))
				return false;
		}
		return true;
	}

}
