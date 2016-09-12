package co.edu.usa.adf.OverClass;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ControladorDeInformacionTest {

	ControladorDeInformacion controladorDeInformacion;
	
	@Before
	public void setUp() throws Exception {
		controladorDeInformacion= new ControladorDeInformacion();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void debeLanzarExceptionPorQueElArchivoDeNombresNoSeEncontro(){
		try {
			controladorDeInformacion.leerArchivos("RutaFalsa",1);
			fail();
		} catch (FileNotFoundException e) {
			assertEquals("La Ruta No Existe", e.getMessage());
		}
		catch (Exception e){
			fail();
		}
	}
	
	@Test
	public void debeLanzarExceptionPorQueElArchivoDeDatosNoSeEncontro(){
		try {
			controladorDeInformacion.leerArchivos("RutaFalsa",2);
			fail();
		} catch (FileNotFoundException e) {
			assertEquals("La Ruta No Existe", e.getMessage());
		}
		catch (Exception e){
			fail();
		}
	}
	
	@Test
	public void debePasarLaPruebaPorQueElArchivoDeNombresExiste(){
		try {
			controladorDeInformacion.leerArchivos("nombreDeClases.txt",1);
		}catch (Exception e){
			fail();
		}
	}
	
	@Test
	public void debePasarLaPruebaPorQueElArchivoDeDatosExiste(){
		try {
			controladorDeInformacion.leerArchivos("datos//Nombres.txt",2);
		}catch (Exception e){
			System.out.println(e);
			fail();
		}
	}
	
	@Test
	public void debePasarLaPruebaPorQueAmbasListasDeNombresSonIguales(){
		try {
			ArrayList<String> listaPrueba= new ArrayList<String>();
			listaPrueba.add("co.edu.usa.adf.OverClass.Pais");
			listaPrueba.add("co.edu.usa.adf.OverClass.Contacto");
			listaPrueba.add("co.edu.usa.adf.OverClass.Serie");
			controladorDeInformacion.leerArchivos("nombreDeClases.txt",1);
			boolean iguales= listaPrueba.equals(controladorDeInformacion.getInformacionArchivo());
			assertTrue(iguales);			
		}catch (Exception e){
			fail();
		}
	}
	
	@Test
	public void debeSalirTruePorQueLaListaDeNombresEstaVacia(){
		try {
			boolean vacio= controladorDeInformacion.listaVaciaInfoArchivos();
			assertTrue(vacio);			
		}catch (Exception e){
			fail();
		}
	}
	
	@Test
	public void debeSalirFalsePorQueLaListaDeNombresNoEstaVacia(){
		try {
			controladorDeInformacion.leerArchivos("nombreDeClases.txt",1);
			boolean vacio= controladorDeInformacion.listaVaciaInfoArchivos();
			assertFalse(vacio);			
		}catch (Exception e){
			fail();
		}
	}
	
	@Test
	public void debeSalirElNombreDeLaClasePais(){
		try {
			controladorDeInformacion.leerArchivos("nombreDeClases.txt",1);
			assertEquals("co.edu.usa.adf.OverClass.Pais", controladorDeInformacion.obtenerInformacionArhivo(0));	
		}catch (Exception e){
			fail();
		}
	}
	
	@Test
	public void debeSalirElNombreDeLaClaseContacto(){
		try {
			controladorDeInformacion.leerArchivos("nombreDeClases.txt",1);
			assertEquals("co.edu.usa.adf.OverClass.Contacto", controladorDeInformacion.obtenerInformacionArhivo(1));	
		}catch (Exception e){
			fail();
		}
	}
	
	@Test
	public void debeSalirElNombreDeLaClaseSerie(){
		try {
			controladorDeInformacion.leerArchivos("nombreDeClases.txt",1);
			assertEquals("co.edu.usa.adf.OverClass.Serie", controladorDeInformacion.obtenerInformacionArhivo(2));	
		}catch (Exception e){
			fail();
		}
	}
	
	@Test
	public void debeLanzarExcepcionPorQueElIndiceNoEsValidoParaLaListaDeNombres(){
		try {
			controladorDeInformacion.leerArchivos("nombreDeClases.txt",1);
			controladorDeInformacion.obtenerInformacionArhivo(3);
			fail();
		}catch (IndexOutOfBoundsException e){
			assertEquals("Indice No Valido",e.getMessage());
		}catch (Exception e){
			fail();
		}
	}
	
}
