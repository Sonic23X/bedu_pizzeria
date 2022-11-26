package lealtad;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LealtadTesting {
	
	SistemaLealtad compra;
	
	@BeforeTest
	public void condicionesIniciales() {
		this.compra = new SistemaLealtad();
	}
	
	@Test
	public void verificarClienteConTarjeta() {
		this.compra.setEstatusTarjeta(true);
		boolean actualResult = this.compra.getEstatusTarjeta();
		boolean expectedResult = true;
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarClienteSinTarjeta() {
		this.compra.setEstatusTarjeta(false);
		boolean actualResult = this.compra.getEstatusTarjeta();
		boolean expectedResult = false;
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarClienteConPuntosMenoresA50() {
		this.compra.setSaldoPuntos(0);
		String actualResult = this.compra.mostrarProductosExtras();
		String expectedResult = "";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarClienteConPuntosEntre50Y100() {
		this.compra.setSaldoPuntos(50);
		String actualResult = this.compra.mostrarProductosExtras();
		String expectedResult = "Spaghetti";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarClienteConPuntosEntre100Y150() {
		this.compra.setSaldoPuntos(100);
		String actualResult = this.compra.mostrarProductosExtras();
		String expectedResult = "Spaghetti y queso extra";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarClienteConPuntosMayoresA150() {
		this.compra.setSaldoPuntos(150);
		String actualResult = this.compra.mostrarProductosExtras();
		String expectedResult = "Pizza, spaghetti y queso extra";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarCuponGuardado() {
		this.compra.usarCupon("N");
		boolean actualResult = this.compra.getEstatusCupon();
		boolean expectedResult = true;
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarCuponNoGuardado() {
		this.compra.usarCupon("Y");
		boolean actualResult = this.compra.getEstatusCupon();
		boolean expectedResult = false;
		Assert.assertEquals(actualResult, expectedResult);
	}
}
