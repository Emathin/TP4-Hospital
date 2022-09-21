package ar.edu.unlam.hospital;

import java.util.Set;

public class Hipertenso extends Paciente {

	public Hipertenso(String nombreDePaciente, Integer dni) {
		super(nombreDePaciente, dni);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Boolean puedeComer(Set<String> losIngredientes, Elaboracion elaboracion) {
		for (String string : losIngredientes) {
			if (string.equals("sal"))
				return false;
		}
		return true;
	}

}
