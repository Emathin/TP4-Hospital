package ar.edu.unlam.hospital;

import java.util.Set;

public class Celiaco extends Paciente {

	public Celiaco(String nombreDePaciente, Integer dni) {
		super(nombreDePaciente, dni);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Boolean puedeComer(Set<String> losIngredientes, Elaboracion elaboracion) {
		for (String string : losIngredientes) {
			if (string.equals("trigo") || string.equals("avena") || string.equals("cebada") || string.equals("centeno"))
				return false;
		}
		return true;
	}

}
