package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import uniandes.cupi2.almacen.mundo.Almacen;
import uniandes.cupi2.almacen.mundo.AlmacenException;
import uniandes.cupi2.almacen.mundo.Categoria;

public class AlmacenTest 

{
	private Almacen almacen;
	
	@BeforeEach
	public void setup (File pArchivo)  throws AlmacenException
	{
	    {
	        cargar( pArchivo );
	    }
	}
	
    @BeforeEach
    public void cargar( File pArchivo ) throws AlmacenException
    {
        try
        {
            BufferedReader in = new BufferedReader( new FileReader( pArchivo ) );
            Categoria almacen = new Categoria( in.readLine( ), in );
        }
        catch( Exception e )
        {
            e.printStackTrace(  );
            throw new AlmacenException( "Error al leer el archivo.\n" + e.getMessage( ) );

        }
    }
	
	
	@Test
	
	public void testConstructor()
	
	{
		assertEquals("datos.txt",almacen.darCategoriaRaiz(),"Esta malo el archivo");
		assertEquals("datos.txt",almacen.darCategoriaRaiz(),"Esta malo el archivo");

	}
	
	@Test
	public void testEliminarNodo()
	
	{
		assertEquals("datos.txt",almacen.darCategoriaRaiz(),"Esta malo el archivo");

	}
	
	@Test
	public void testAgregarNodo()
	
	{
		assertEquals("datos.txt",almacen.darCategoriaRaiz(),"Esta malo el archivo");
		assertEquals("datos.txt",almacen.darCategoriaRaiz(),"Esta malo el archivo");

	}
	
	@Test
	public void testVenderProducto()
	
	{
		assertEquals("datos.txt",almacen.darCategoriaRaiz(),"Esta malo el archivo");
		assertEquals("datos.txt",almacen.darCategoriaRaiz(),"Esta malo el archivo");

	}
	
	
	@Test
	public void testBuscarNodo()
	
	{
		assertEquals("datos.txt",almacen.darCategoriaRaiz(),"Esta malo el archivo");
		assertEquals("datos.txt",almacen.darCategoriaRaiz(),"Esta malo el archivo");

	}
	
	@Test
	public void testAgregarProducto()
	
	{
		assertEquals("datos.txt",almacen.darCategoriaRaiz(),"Esta malo el archivo");
		assertEquals("datos.txt",almacen.darCategoriaRaiz(),"Esta malo el archivo");

	}
	
	@Test
	public void testEliminarProducto()
	
	{
		assertEquals("datos.txt",almacen.darCategoriaRaiz(),"Esta malo el archivo");
		assertEquals("datos.txt",almacen.darCategoriaRaiz(),"Esta malo el archivo");

	}
	
	
}
