package ar.edu.unlam.hospital;

import java.util.HashSet;
import java.util.Set;

public class Plato {
	private String nombreDelPlato;
	private Set<String> ingredientes;
	private Elaboracion elaboracionDeEstePlato;

	public Plato(String nombrePlato, Elaboracion elaboracion) {
		this.nombreDelPlato = nombrePlato;
		this.elaboracionDeEstePlato = elaboracion;
		this.ingredientes = new HashSet<String>();
	}

	public void agregarIngredientesAlPlato(String Ingrediente) {
		this.ingredientes.add(Ingrediente);
	}

	public Elaboracion getElaboracionDeEstePlato() {
		return elaboracionDeEstePlato;
	}

	public Set<String> getIngredientes() {
		return ingredientes;
	}

}
