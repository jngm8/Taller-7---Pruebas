package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import uniandes.cupi2.almacen.mundo.Almacen;
import uniandes.cupi2.almacen.mundo.AlmacenException;

public class TestAlmacen 

{
	private Almacen almacen;
	
	@BeforeEach
	public void setup() throws AlmacenException
	{
		almacen = new Almacen(new File("./data/datos.txt"));
	}
	
	
	
	@Test
	public void testCarga()
	{
		assertThrows(AlmacenException.class,()->{
			
		});
	}
	
	
	
}
