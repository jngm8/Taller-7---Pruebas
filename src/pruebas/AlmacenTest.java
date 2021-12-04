package pruebas;

import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.Before;

import uniandes.cupi2.almacen.mundo.Almacen;
import uniandes.cupi2.almacen.mundo.AlmacenException;
import uniandes.cupi2.almacen.mundo.Categoria;

public class AlmacenTest 

{
	private Almacen almacen;
	
	private Categoria categoria;
	
	@Before
	public void setup ()
	{
        try
        {
            BufferedReader in = new BufferedReader( new FileReader( pArchivo ) );
            almacen = new Categoria( in.readLine( ), in );
        }
        catch( Exception e )
        {
            e.printStackTrace(  );
            throw new AlmacenException( "Error al leer el archivo.\n" + e.getMessage( ) );

        }
	}
	
	@Test
	
	public void test()
	
	{
		
	}
	
}
