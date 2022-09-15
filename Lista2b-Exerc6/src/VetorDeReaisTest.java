import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VetorDeReaisTest {

	@Test
	void testDivide() {
		VetorDeReais vdr = new VetorDeReais(3);
		vdr.setValor(2,0);
		vdr.setValor(-1,1);
		vdr.setValor(3.5, 2);
		VetorDeReais vdr1 = new VetorDeReais(1);
		vdr1.setValor(3,0);
		vdr.divide(vdr1);
		assertEquals(null, vdr.divide(vdr1));

	}
	void testDivide1() {
		VetorDeReais vdr = new VetorDeReais(3);
		vdr.setValor(2,0);
		vdr.setValor(-1,1);
		vdr.setValor(3.5, 2);
		VetorDeReais vdr1 = new VetorDeReais(1);
		vdr1.setValor(3,0);
		vdr1.setValor(2,1);
		vdr1.setValor(1,2);
		vdr.divide(vdr1);
		double[]vet={0.666666, -0.5 , 3.5 };
		assertArrayEquals(vet, vdr.divide(vdr1));

	}

}
