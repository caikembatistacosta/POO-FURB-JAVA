import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;

class ContribuinteTest {

	@Test
	void testSetUF() {
		Contribuinte c = new Contribuinte();
		
		c.setUF("SC");
		
		assertEquals("SC", c.getUF());
		

	}
	@Test
	void testSetUF1() {
		Contribuinte c = new Contribuinte();
		
		c.setUF("PR");
		
		assertEquals("PR", c.getUF());
		

	}
	@Test
	void testSetUF2() {
		Contribuinte c = new Contribuinte();
		
		c.setUF("SP");
		
		assertEquals(null, c.getUF());
		
	}
	@Test
	void testSetUF3() {
		Contribuinte c = new Contribuinte();
		
		c.setUF("RJ");
		
		assertEquals(null, c.getUF());
		
	}

	@Test
	void testGetRendaAnual() {
		Contribuinte c = new Contribuinte();
		
		c.setRendaAnual(818.50);
		c.setRendaAnual(-818.50);
		
		assertEquals(818.50, c.getRendaAnual());
	}

	@Test
	void testGetImposto() {
		Contribuinte c = new Contribuinte();
		
		c.setRendaAnual(3000);
		
		
		double imposto = c.getImposto();
	    assertEquals(0, imposto);
		
	}
	@Test
	void testGetImposto1() {
		Contribuinte c = new Contribuinte();
		
		c.setRendaAnual(9000);
		
		
		double imposto = c.getImposto();
		
	    assertEquals(522, imposto);
		
	}
	@Test
	void testGetImposto2() {
		Contribuinte c = new Contribuinte();
		
		c.setRendaAnual(10000);
		
		
		double imposto = c.getImposto();
		
	    assertEquals(1500, imposto);
		
	}
	@Test
	void testGetImposto3() {
		Contribuinte c = new Contribuinte();
		
		c.setRendaAnual(34911.73);

		double imposto = c.getImposto();
		
	   assertEquals(9.600,72, imposto);
	    
		
	}

}
