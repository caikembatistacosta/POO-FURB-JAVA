package lista1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InteiroPositivoTest {

	@Test
	void testFatorial() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(10);

		assertEquals(3628800, ip.fatorial());
	}
	@Test
	void testFatorial1() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(20);

		assertEquals(2432902008176640000L, ip.fatorial());
	}

	@Test
	void testIdentificaDivisoresInteiros() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(14);
		assertEquals("Os divisores são 1,2,7,14, e a quantidade de divisores é 4", ip.identificaDivisoresInteiros());
	}
	@Test
	void testIdentificaDivisoresInteiros1() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(18);
		assertEquals("Os divisores são 1,2,3,6,9,18, e a quantidade de divisores é 6", ip.identificaDivisoresInteiros());
	}


	@Test
	void testFibonacci() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(9);
		int[] inteiro = {1, 1, 2, 3, 5, 8, 13, 21, 34};
		assertArrayEquals(inteiro, ip.fibonacci());
	}
	@Test
	void testFibonacci1() {
		InteiroPositivo ip = new InteiroPositivo();
		ip.setValor(15);
		int[] inteiro = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
		assertArrayEquals(inteiro, ip.fibonacci());
	}

}
