import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class MatematicaTest {
	Matematica matematica = new Matematica();

	/**
	 * Test de la Parte 1
	 * Este test nos dará fallo cuando el resultado y el resultado2 no coincidan.
	 */
	
	@Test
	public void testSuma() {
	int resultado = matematica.sumaNum(2, 5);
	int resultado2 = 7;
	assertEquals(resultado2,resultado);
	
	}
	
	
	/**
	 * Test de la Parte 2
	 * Este test fallará cuando el resultado no sea false.
	 */
	
	@Test
	public void testNumeroMayor(){
	boolean resultado = matematica.comparacionNumeros(2, 7);
	assertFalse(resultado);
		
	}
	
	/**
	 * Test de la Parte 3
	 * Este test dará fallo cuando el ArrayList este vacio y no haya sumas guardadas.
	 */
	
	@Test
	public void testGetSumas(){
		ArrayList<Integer> resultado = matematica.getSumas();
		assertNotNull(resultado);
	}
}

