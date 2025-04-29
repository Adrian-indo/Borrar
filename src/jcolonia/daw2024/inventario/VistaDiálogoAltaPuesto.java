package jcolonia.daw2024.inventario;

import static java.lang.System.out;

import java.util.Scanner;

/**
 * Vista: Pantalla de altas para equipos informáticos en un aula.
 * 
 * @see ControladorInventarioAula
 * @see InventarioAula
 * 
 * @version 6.90 (2025426000)
 * @author <a href="mailto:dmartin.jcolonia@gmail.com">David H. Martín</a>
 */
public class VistaDiálogoAltaPuesto extends VistaGeneral {
	/** Control supervisor, de apoyo para completar altas */
	private ControladorInventarioAula control;

	/**
	 * Almacena el nombre o título.
	 * 
	 * @param nombre  el texto deseado
	 * @param control el control de la vista
	 */
	public VistaDiálogoAltaPuesto(String nombre, ControladorInventarioAula control) {
		super(nombre);
		this.control = control;
	}

	/**
	 * Recoge de la entrada estándar el código y datos del equipo y realiza el alta.
	 * Pide confirmación al usuario antes de completar el alta y muestra un error si
	 * los datos introducidos no resultan válidos.
	 * 
	 * @see ControladorInventarioAula#procesarAlta(String, PuestoUsuario)
	 * @return si el alta se ha completado o no
	 */
	public boolean entradaPuestoUsuario() {
		VistaGeneral.mostrarAviso("PENDIENTE: programador ocupado…");
		return true;
	}
}
