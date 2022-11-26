package bedu_pizzeria;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PizzeriaTest {
	PizzaOrden nuevaOrden;
	
	@BeforeTest
	public void condicionesIniciales() {
		this.nuevaOrden = new PizzaOrden();
	}

	@Test
	public void verificarOpcionVeganaVerdadera() {
		this.nuevaOrden.setOpcionVeg("Y");
		boolean actualResult = this.nuevaOrden.getOpcionVeg();
		boolean expectedResult = true;
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarOpcionVeganaFalsa() {
		boolean actualResult = this.nuevaOrden.getOpcionVeg();
		boolean expectedResult = false;
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteUnoComoPimiento() {
		this.nuevaOrden.setIngrediente1("a");
		String actualResult = this.nuevaOrden.getIngrediente1();
		String expectedResult = "Pimiento";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteUnoComoHongos() {
		this.nuevaOrden.setIngrediente1("b");
		String actualResult = this.nuevaOrden.getIngrediente1();
		String expectedResult = "Hongos";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteUnoComoEspinaca() {
		this.nuevaOrden.setIngrediente1("c");
		String actualResult = this.nuevaOrden.getIngrediente1();
		String expectedResult = "Espinaca";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteUnoComoPeperoni() {
		this.nuevaOrden.setIngrediente1("d");
		String actualResult = this.nuevaOrden.getIngrediente1();
		String expectedResult = "Peperoni";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteUnoComoJamon() {
		this.nuevaOrden.setIngrediente1("e");
		String actualResult = this.nuevaOrden.getIngrediente1();
		String expectedResult = "Jamon";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteUnoComoSalchicha() {
		this.nuevaOrden.setIngrediente1("f");
		String actualResult = this.nuevaOrden.getIngrediente1();
		String expectedResult = "Salchicha";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteUnoComoNoValido() {
		this.nuevaOrden.setIngrediente1("o"); //Cualquier tecla lo toma como no_valido
		String actualResult = this.nuevaOrden.getIngrediente1();
		String expectedResult = "Opcion_Invalida";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteDosComoPimiento() {
		this.nuevaOrden.setIngrediente2("a");
		String actualResult = this.nuevaOrden.getIngrediente2();
		String expectedResult = "Pimiento";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteDosComoHongos() {
		this.nuevaOrden.setIngrediente2("b");
		String actualResult = this.nuevaOrden.getIngrediente2();
		String expectedResult = "Hongos";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteDosComoEspinaca() {
		this.nuevaOrden.setIngrediente2("c");
		String actualResult = this.nuevaOrden.getIngrediente2();
		String expectedResult = "Espinaca";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteDosComoPeperoni() {
		this.nuevaOrden.setIngrediente2("d");
		String actualResult = this.nuevaOrden.getIngrediente2();
		String expectedResult = "Peperoni";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteDosComoJamon() {
		this.nuevaOrden.setIngrediente2("e");
		String actualResult = this.nuevaOrden.getIngrediente2();
		String expectedResult = "Jamon";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteDosComoSalchicha() {
		this.nuevaOrden.setIngrediente2("f");
		String actualResult = this.nuevaOrden.getIngrediente2();
		String expectedResult = "Salchicha";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteDosComoNoValido() {
		this.nuevaOrden.setIngrediente2("o"); //Cualquier tecla lo toma como no_valido
		String actualResult = this.nuevaOrden.getIngrediente2();
		String expectedResult = "Opcion_Invalida";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteTresComoPimiento() {
		this.nuevaOrden.setIngrediente3("a");
		String actualResult = this.nuevaOrden.getIngrediente3();
		String expectedResult = "Pimiento";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteTresComoHongos() {
		this.nuevaOrden.setIngrediente3("b");
		String actualResult = this.nuevaOrden.getIngrediente3();
		String expectedResult = "Hongos";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteTresComoEspinaca() {
		this.nuevaOrden.setIngrediente3("c");
		String actualResult = this.nuevaOrden.getIngrediente3();
		String expectedResult = "Espinaca";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteTresComoPeperoni() {
		this.nuevaOrden.setIngrediente3("d");
		String actualResult = this.nuevaOrden.getIngrediente3();
		String expectedResult = "Peperoni";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteTresComoJamon() {
		this.nuevaOrden.setIngrediente3("e");
		String actualResult = this.nuevaOrden.getIngrediente3();
		String expectedResult = "Jamon";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteTresComoSalchicha() {
		this.nuevaOrden.setIngrediente3("f");
		String actualResult = this.nuevaOrden.getIngrediente3();
		String expectedResult = "Salchicha";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngredienteTresComoNoValido() {
		this.nuevaOrden.setIngrediente3("o"); //Cualquier tecla lo toma como no_valido
		String actualResult = this.nuevaOrden.getIngrediente3();
		String expectedResult = "Opcion_Invalida";
		Assert.assertEquals(actualResult, expectedResult);
	}
}
