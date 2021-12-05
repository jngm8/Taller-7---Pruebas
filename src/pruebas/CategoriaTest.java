package pruebas;

import java.io.BufferedReader;
import java.util.ArrayList;

import uniandes.cupi2.almacen.mundo.AlmacenException;
import uniandes.cupi2.almacen.mundo.Categoria;
import org.junit.jupiter.api.BeforeEach;


public class CategoriaTest 

{
	private Categoria categoria;
	
	
	@BeforeEach
    public void Categoria( String pLinea, BufferedReader pLector ) throws AlmacenException
    {
        super( TIPO, pLinea.split( ";;;" )[ 1 ], pLinea.split( ";;;" )[ 2 ] );
        nodosHijos = new ArrayList<>( );
        try
        {
            String datos[] = pLinea.split( ";;;" );
            int numHijos = Integer.parseInt( datos[ 3 ] );
            while( numHijos-- > 0 )
            {
                agregarNodo( identificador, crearNodo( pLector ) );
            }
        }
        catch( Exception e )
        {
            throw new AlmacenException( "Error al leer la marca:\n" + e.getMessage( ) );
        }

    }
}
