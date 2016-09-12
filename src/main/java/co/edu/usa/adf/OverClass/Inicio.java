package co.edu.usa.adf.OverClass;

import java.util.ArrayList;

public class Inicio {
	
	private static Controlador ctrl= new Controlador();

	public static void main(String[] args) {
		try {
			ctrl.cargarInformacionArchivos("descripcion4.txt");
			ArrayList<String> infoArchivos= new ArrayList<String>();
			infoArchivos= ctrl.getInformacionArchivos();
			System.out.println(infoArchivos.get(0));
			System.out.println(infoArchivos.get(1));
			ctrl.construirClase(infoArchivos.get(0),infoArchivos.get(1));
			ctrl.imprimir("listaPrueba.txt");
		} catch (Exception e) {
			System.out.println("Error 1: " + e);
		}
	}
}
