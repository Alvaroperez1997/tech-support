import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
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
    //Map con las respuestas
    private HashMap<String, String> respuestasClave;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas = new ArrayList<String>();
        respuestasClave = new HashMap<>();
        respuestas.add("Ok, cual es el problema");
        respuestas.add("Expliquese con mas claridad");
        respuestas.add("Ahora mismo le pasamos con un tecnico");
        respuestas.add("Espere un momento... Gracias");
        respuestas.add("¿Quiere contratar alguna tarifa?");
        respuestasClave.put("problema", "Ok, cual es el problema");
        respuestasClave.put("averia", "Ahora mismo le pasamos con un tecnico");
        respuestasClave.put("tarifa", "¿Quiere contratar alguna tarifa?");
        respuestasClave.put("comprar", "¿Que producto desea?");
        aleatorio = new Random();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String input)
    {
        String respuesta = null;
        if (respuestasClave.containsKey(input)){
            respuesta = respuestasClave.get(input);
        }
        else {
            respuesta = respuestas.get(aleatorio.nextInt(respuestas.size()));
        }
        return respuesta;
    }
}
