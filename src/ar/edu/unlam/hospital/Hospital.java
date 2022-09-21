package ar.edu.unlam.hospital;

import java.util.HashSet;
import java.util.Set;

public class Hospital {
	private String nombreHospital;
	private Set<Paciente> pacientes;

	public Hospital(String nombreHospital) {
		this.nombreHospital = nombreHospital;
		this.pacientes = new HashSet<Paciente>();
	}

	public String getNombreHospital() {
		return nombreHospital;
	}

	public void agregarPaciente(Paciente unPaciente) {
		this.pacientes.add(unPaciente);
	}

	public Paciente buscarPaciente(Integer dni) {
		for (Paciente paciente : pacientes) {
			if (paciente.getDni().equals(dni))
				return paciente;
		}
		return null;
	}
}
