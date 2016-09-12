package co.edu.usa.adf.OverClass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ControladorDeAnotacionesTest {
	
	ControladorDeAnotaciones controladorDeAnotaciones;

	@Before
	public void setUp() throws Exception {
		controladorDeAnotaciones=new ControladorDeAnotaciones();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void debePasarPuesLaClaseEsTomate() {
		try {
			Class<?> nn= Class.forName("co.edu.usa.adf.OverClass.Pais");
			controladorDeAnotaciones.lectorAnotacionesDeClase(nn);
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void debeLanzarExceptionPuesLaClaseNoEsTomate() {
		try {
			Class<?> nn= Class.forName("java.lang.String");
			controladorDeAnotaciones.lectorAnotacionesDeClase(nn);
		} catch (TomateException e) {
			assertEquals("La Clase no tiene la anotacion Tomate", e.getMessage());
		}catch (Exception e){
			fail();
		}
	}
	
	@Test
	public void debePasarPuesElAtributoEsCampo() {
		try {
			Class<?> nn= Class.forName("co.edu.usa.adf.OverClass.Pais");
			controladorDeAnotaciones.lectorAnotacionesDeClase(nn);
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void debeLanzarExceptionPuesElAtributoNoEsCampo() {
		try {
			Class<?> nn= Class.forName("co.edu.usa.adf.OverClass.Prueba");
			controladorDeAnotaciones.lectorAnotacionesDeClase(nn);
		} catch (TomateException e) {
			assertEquals("El atributo no tiene la anotacion Campo", e.getMessage());
		}catch (Exception e){
			fail();
		}
	}
	
}
