package libro;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class LibroDavidTest {
	@Test
	void testGetTitulo() {
		LibroDavid libro1 = new LibroDavid("EL QUIJOTE",300);
		libro1.getTitulo();
		assertEquals("EL QUIJOTE",libro1.getTitulo());
	}
	//Esto es un comentario de prueba
	@Test
	void testSetTitulo() {
		LibroDavid libro1 = new LibroDavid("EL QUIJOTE",300);
		libro1.getTitulo();
		assertEquals("EL QUIJOTE",libro1.getTitulo());
	}

	@Test
	void testAgregarPaginas() {
		LibroDavid libro1 = new LibroDavid("EL QUIJOTE",300);
		libro1.agregarPaginas(50);
		assertEquals(350,libro1.getNumeroDePaginas());
	}

	@Test
	void testQuitarPaginas() {
		LibroDavid libro1 = new LibroDavid("EL QUIJOTE",300);
		libro1.quitarPaginas(50);
		assertEquals(250,libro1.getNumeroDePaginas());
	}
	//Al hacer el análisis de cobertura el algunos metodos nos saldrá 0% debido a que no hemos probado todos los metodos y por eso nos sale en verde un 60% mas o menos.
	//Y en los metodos probados nos saldrá el 100% ya que las pruebas son correctas.
}
