package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

import uniandes.cupi2.almacen.mundo.AlmacenException;
import uniandes.cupi2.almacen.mundo.Categoria;
import uniandes.cupi2.almacen.mundo.Producto;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


public class CategoriaTest 

{
	private Categoria categoria;
	
	
	@Before
    public void setup() throws AlmacenException
    {
		categoria = new Categoria("1234","Nicolas");
    }
	
	
	@Test
	public void testAgregarNodo()
	{
		assertTrue(categoria.darNodos().isEmpty());
		
		assertDoesNotThrow(()->{
			categoria.agregarNodo("1234","Categoria","7482","Pedro");
		});
		assertFalse(categoria.darNodos().isEmpty());
		 
	}
	
	
	@Test
	
	public void testDarProductos()
	{
		List<Producto> hola = categoria.darProductos();
		
		assertFalse(hola.isEmpty());
		
	}
	
	
	
	
	
}
