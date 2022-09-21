package ar.edu.unlam.hospital;

import java.util.Set;

public class Oncologico extends Paciente {

	public Oncologico(String nombreDePaciente, Integer dni) {
		super(nombreDePaciente, dni);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Boolean puedeComer(Set<String> losIngredientes, Elaboracion elaboracion) {

		if (elaboracion.equals(Elaboracion.sinCocción)) {
			return false;
		} else
			return true;
	}

}
