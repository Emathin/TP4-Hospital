package ar.edu.unlam.hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public abstract class Paciente {
	protected String nombreDePaciente;
	protected Integer dni;
	protected List<Plato> comidas;

	public Paciente(String nombreDePaciente, Integer dni) {
		this.nombreDePaciente = nombreDePaciente;
		this.dni = dni;
		this.comidas = new ArrayList<Plato>();
	}

	public Boolean comer(Plato unPlato) {
		if (puedeComer(unPlato.getIngredientes(),unPlato.getElaboracionDeEstePlato())) {
			this.comidas.add(unPlato);
			return true;
		}
		return false;
	}

	protected abstract Boolean puedeComer(Set<String> losIngredientes, Elaboracion elaboracion);

	public Integer getDni() {
		return dni;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(dni, other.dni);
	}

}
