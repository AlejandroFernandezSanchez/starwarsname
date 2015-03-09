
/**
 * Crea un nombre al estilo star wars.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    private static final int PRIMERAPELLIDOREAL = 3, PRIMERAPELLIDOMADRE = 2, NOMBREREAL = 3, NOMBRECIUDAD = 3;  
     
    public NameGenerator()
    {
        
    }
    
    public String generateStarWarsName(String nombre, String apellido, String apellidoMadre, String nombreciudad)    {              
        return nombre.substring(0, PRIMERAPELLIDOREAL) + apellido.substring(0,PRIMERAPELLIDOREAL).toLowerCase() + " " + apellidoMadre.substring(0,PRIMERAPELLIDOMADRE) + nombreciudad.substring(0,NOMBRECIUDAD).toLowerCase();        
    }
}
