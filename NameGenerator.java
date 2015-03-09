
/**
 * Crea un nombre al estilo star wars.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    private static final int PRIMERAPELLIDOREALPRINCIPIO = 0, PRIMERAPELLIDOREALFINAL = 3, PRIMERAPELLIDOMADREPRINCIPIO = 0, PRIMERAPELLIDOMADREFINAL = 2, NOMBREREALPRINCIPIO = 0, NOMBREREALFINAL = 3, NOMBRECIUDADPRINCIPIO = 0, NOMBRECIUDADFINAL = 3;  
     
    public NameGenerator()
    {
        
    }
    
    public String generateStarWarsName(String nombre, String apellido, String apellidoMadre, String nombreciudad)    {              
        return nombre.substring(PRIMERAPELLIDOREALPRINCIPIO, PRIMERAPELLIDOREALFINAL) + apellido.substring(PRIMERAPELLIDOREALFINAL,PRIMERAPELLIDOREALFINAL).toLowerCase() + " " + apellidoMadre.substring(PRIMERAPELLIDOMADREPRINCIPIO,PRIMERAPELLIDOMADREFINAL) + nombreciudad.substring(NOMBRECIUDADPRINCIPIO,NOMBRECIUDADFINAL).toLowerCase();        
    }
}
