package eed;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

class MyStringTest {

	@Test
	void testContarPalabras() {
		assertEquals(0, MyString.contarPalabras(null)); 
        assertEquals(0, MyString.contarPalabras("")); 
        assertEquals(1, MyString.contarPalabras("Hola")); 
        assertEquals(4, MyString.contarPalabras("Hola, ¿cómo estás hoy?")); 
        assertEquals(2, MyString.contarPalabras("  Hola  prueba ")); 
	}

	@Test
	void testContarLetrasDiferentes() {
		assertEquals(0, MyString.contarLetrasDiferentes(null)); 
	    assertEquals(0, MyString.contarLetrasDiferentes("")); 
	    assertEquals(4, MyString.contarLetrasDiferentes("Hola")); 
	    assertEquals(9, MyString.contarLetrasDiferentes("Hola, ¿cómo estás?"));
	    assertEquals(2, MyString.contarLetrasDiferentes("aaaa bbbb")); 
	}

	@Test
	void testContarFrecuenciaPalabras() {
		assertTrue(MyString.contarFrecuenciaPalabras(null).isEmpty()); 
	    assertTrue(MyString.contarFrecuenciaPalabras("").isEmpty()); 
	    assertEquals(Map.of("hola", 1), MyString.contarFrecuenciaPalabras("Hola"));
	    assertEquals(Map.of("hola", 2, "mundo", 1), MyString.contarFrecuenciaPalabras("Hola mundo hola"));
	    assertEquals(Map.of("esto", 1, "es", 1, "prueba", 1), MyString.contarFrecuenciaPalabras("Esto es prueba"));
	}

	@Test
	void testContarFrecuenciaLetras() {
		assertTrue(MyString.contarFrecuenciaLetras(null).isEmpty());
	    assertTrue(MyString.contarFrecuenciaLetras("").isEmpty());
	    assertEquals(Map.of('h', 1, 'o', 1, 'l', 1, 'a', 1), MyString.contarFrecuenciaLetras("Hola")); 
	    assertEquals(Map.of('h', 2, 'o', 4, 'l', 1, 'a', 1, 'm', 2, 'u', 1, 'n', 1, 'd', 1), 
	                 MyString.contarFrecuenciaLetras("Hola mundo, hola"));
	    assertEquals(Map.of('a', 4, 'b', 4), MyString.contarFrecuenciaLetras("aaaa   bbbb"));
	}

	@Test
	void testEsPalindroma() {
		assertFalse(MyString.esPalindroma(null));
	    assertFalse(MyString.esPalindroma("")); 
	    assertTrue(MyString.esPalindroma("Ana"));
	    assertTrue(MyString.esPalindroma("A Santa at NASA")); 
	    assertFalse(MyString.esPalindroma("Hola")); 
	    assertTrue(MyString.esPalindroma("anilina"));
	}

}
