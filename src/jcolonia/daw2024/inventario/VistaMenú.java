package jcolonia.daw2024.inventario;

import java.util.Arrays;

/**
 * Vista: Utilidades prototipo de gestión de menú.
 * 
 * @see ControladorInventarioAula
 * 
 * @version 1.2 (20250428000)
 * @author <a href="mailto:dmartin.jcolonia@gmail.com">David H. Martín</a>
 */
public class VistaMenú extends VistaGeneral {

	/** Alternativas de visualización del menú. */
	public enum Modo {
		/** Visualización de las opciones en fila. */
		HORIZONTAL,
		/** Visualización de las opciones en columna. */
		VERTICAL
	}

	/** Formato común tipo «printf» de las opciones de menú. */
	private static final String FORMATO_OPCIONES_MENÚ = "  %d) %s%n";
	
	/** Textos de las opciones del menú. */
	private String[] textoOpciones;
	/** Marca para incluir o no la opción de salida. */
	private boolean conSalir;

	/**
	 * Crea un menú con las opciones indicadas. Incorpora y activa la opción «0»
	 * para salir o finalizar.
	 * 
	 * @param nombre   el nombre o título del menú
	 * @param opciones la lista original de opciones a copiar
	 */
	public VistaMenú(String nombre, String[] opciones) {
		super(nombre);

		textoOpciones = Arrays.copyOf(opciones, opciones.length);
		conSalir = true;
	}

	/**
	 * Envía a la consola de texto –salida estándar– la lista numerada de opciones
	 * disponibles. Opcionalmente incluye la opción «0» para salir o finalizar.
	 * 
	 * @see #conSalir
	 */
	public void mostrarMenú() {
		VistaGeneral.mostrarAviso("PENDIENTE: programador ocupado…");
	}

	/**
	 * Solicita al usuario elegir una opción de menú. En caso de no elegir una
	 * opción válida insiste de manera indefinida hasta obtener una.
	 * 
	 * @return el número de la opción elegida [1..n]
	 */
	public int pedirOpción() {
		VistaGeneral.mostrarAviso("PENDIENTE: programador ocupado…");
		return 0;
	}
}
