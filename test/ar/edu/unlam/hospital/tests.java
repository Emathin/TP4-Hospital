package ar.edu.unlam.hospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class tests {

	@Test
	public void test() {

	}

	@Test
	public void queSePuedaCrearUnHospitalConPacientesYDistintosTiposDePlatos() {
		Hospital hospital1 = new Hospital("Garrahan");

		Paciente pacInsulinoDependiente = new Diabetico1InsulinoDependiente("Carlito", 21468598);
		Paciente pacDiabetico2 = new Diabetico2("Juan Carlos", 31452687);
		Paciente pacHipertenso = new Hipertenso("Oscar", 44587132);
		Paciente pacCeliaco = new Celiaco("Ramona", 47854126);
		Paciente pacOncologico = new Oncologico("Rocio", 24151223);
		Paciente pacGeneral = new General("Violeta", 36482197);

		Plato plato1 = new Plato("Fideos con tuco", Elaboracion.enOlla); // Trigo
		Plato plato2 = new Plato("Lemon Pie", Elaboracion.alHorno);// Dulce
		Plato plato3 = new Plato("Sushi", Elaboracion.sinCocción);// Crudo
		Plato plato4 = new Plato("Asado", Elaboracion.alHorno); // Salado

		assertTrue(hospital1 instanceof Hospital);
		assertTrue(pacHipertenso instanceof Paciente);
		assertTrue(plato1 instanceof Plato);

	}

	@Test
	public void queSePuedanAgregarPacientesEIntentarDarlesDeComerAlgoQueNoPueden() {
		Hospital hospital1 = new Hospital("Garrahan");

		Diabetico pacInsulinoDependiente = new Diabetico1InsulinoDependiente("Carlito", 21468598);
		Diabetico pacDiabetico2 = new Diabetico2("Juan Carlos", 31452687);
		Paciente pacHipertenso = new Hipertenso("Oscar", 44587132);
		Paciente pacCeliaco = new Celiaco("Ramona", 47854126);
		Paciente pacOncologico = new Oncologico("Rocio", 24151223);
		Paciente pacGeneral = new General("Violeta", 36482197);

		hospital1.agregarPaciente(pacInsulinoDependiente);
		hospital1.agregarPaciente(pacDiabetico2);
		hospital1.agregarPaciente(pacHipertenso);
		hospital1.agregarPaciente(pacCeliaco);
		hospital1.agregarPaciente(pacOncologico);
		hospital1.agregarPaciente(pacGeneral);

		Plato plato1 = new Plato("Fideos con tuco", Elaboracion.enOlla); // Trigo
		plato1.agregarIngredientesAlPlato("trigo");
		plato1.agregarIngredientesAlPlato("tomate");
		plato1.agregarIngredientesAlPlato("aceite");
		plato1.agregarIngredientesAlPlato("oregano");

		Plato plato2 = new Plato("Lemon Pie", Elaboracion.alHorno);// Dulce
		plato2.agregarIngredientesAlPlato("limon");
		plato2.agregarIngredientesAlPlato("azucar");
		plato2.agregarIngredientesAlPlato("harina");

		Plato plato3 = new Plato("Sushi", Elaboracion.sinCocción);// Crudo
		plato3.agregarIngredientesAlPlato("pescado");
		plato3.agregarIngredientesAlPlato("arroz");
		plato3.agregarIngredientesAlPlato("wasabi");

		Plato plato4 = new Plato("Asado", Elaboracion.alHorno); // Salado
		plato4.agregarIngredientesAlPlato("sal");
		plato4.agregarIngredientesAlPlato("carne");
		plato4.agregarIngredientesAlPlato("chimichurri");

		assertFalse(hospital1.buscarPaciente(21468598).comer(plato2));
		assertFalse(hospital1.buscarPaciente(31452687).comer(plato2));
		assertFalse(hospital1.buscarPaciente(44587132).comer(plato4));
		assertFalse(hospital1.buscarPaciente(47854126).comer(plato1));
		assertFalse(hospital1.buscarPaciente(24151223).comer(plato3));

	}

	@Test
	public void queLosPacientesPuedanComerLoQueDeben() {
		Hospital hospital1 = new Hospital("Garrahan");

		Diabetico pacInsulinoDependiente = new Diabetico1InsulinoDependiente("Carlito", 21468598);
		Diabetico pacDiabetico2 = new Diabetico2("Juan Carlos", 31452687);
		Paciente pacHipertenso = new Hipertenso("Oscar", 44587132);
		Paciente pacCeliaco = new Celiaco("Ramona", 47854126);
		Paciente pacOncologico = new Oncologico("Rocio", 24151223);
		Paciente pacGeneral = new General("Violeta", 36482197);

		hospital1.agregarPaciente(pacInsulinoDependiente);
		hospital1.agregarPaciente(pacDiabetico2);
		hospital1.agregarPaciente(pacHipertenso);
		hospital1.agregarPaciente(pacCeliaco);
		hospital1.agregarPaciente(pacOncologico);
		hospital1.agregarPaciente(pacGeneral);

		Plato plato1 = new Plato("Fideos con tuco", Elaboracion.enOlla); // Trigo
		plato1.agregarIngredientesAlPlato("tomate");
		plato1.agregarIngredientesAlPlato("aceite");
		plato1.agregarIngredientesAlPlato("oregano");

		Plato plato2 = new Plato("Lemon Pie", Elaboracion.alHorno);// Dulce
		plato2.agregarIngredientesAlPlato("limon");
		plato2.agregarIngredientesAlPlato("harina");

		Plato plato3 = new Plato("Sushi", Elaboracion.alHorno);// Crudo
		plato3.agregarIngredientesAlPlato("pescado");
		plato3.agregarIngredientesAlPlato("arroz");
		plato3.agregarIngredientesAlPlato("wasabi");

		Plato plato4 = new Plato("Asado", Elaboracion.alHorno); // Salado
		plato4.agregarIngredientesAlPlato("carne");
		plato4.agregarIngredientesAlPlato("chimichurri");

		Plato plato5 = new Plato("ComboMcDonalds", Elaboracion.sinCocción);// Tiene todo
		// lo que los demás no pueden comer.
		plato5.agregarIngredientesAlPlato("azucar");
		plato5.agregarIngredientesAlPlato("sal");
		plato5.agregarIngredientesAlPlato("trigo");

		assertTrue(hospital1.buscarPaciente(21468598).comer(plato2));
		assertTrue(hospital1.buscarPaciente(31452687).comer(plato2));
		assertTrue(hospital1.buscarPaciente(44587132).comer(plato4));
		assertTrue(hospital1.buscarPaciente(47854126).comer(plato1));
		assertTrue(hospital1.buscarPaciente(24151223).comer(plato3));
		assertTrue(hospital1.buscarPaciente(36482197).comer(plato5));

	}

}
