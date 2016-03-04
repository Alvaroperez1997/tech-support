import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    //Almacena las respuestas
    private ArrayList<String> respuestas;
    //Numero aleatorio
    private Random aleatorio;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas = new ArrayList<String>();
        respuestas.add("Ok, cual es el problema");
        respuestas.add("Expliquese con mas claridad");
        respuestas.add("Ahora mismo le pasamos con un tecnico");
        respuestas.add("Espere un momento... Gracias");
        respuestas.add("¿Quiere contratar alguna tarifa?");
        aleatorio = new Random();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int numRespuesta = aleatorio.nextInt(respuestas.size());
        return respuestas.get(numRespuesta);
    }
}
