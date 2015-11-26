/**
 * clase que contiene un mensaje.
 * 
 */
public class MailItem
{
    // quien envia el mensaje
    private String from;
    // receptor del mensaje
    private String to;
    // mensaje
    private String message;
    /**
     * Constructor que inicia las variables de MailItem
     */
    public MailItem(String de, String para, String mensaje)
    {
        // initialise instance variables
        from = de;
        to = para;
        message = mensaje;
    }

    /**
     * Método que devuelve el atributo from
     */
    public String getFrom()
    {
        return from;
    }

    /**
     * Método que devuelve el atributo for
     */
    public String getTo()
    {
        return to;
    }

    /**
     * Método que devuelve la cadena almacenada en from
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Imprime por pantalla el nombre del emisor el receptor y el mensaje
     */
    public void printMail()
    {
        System.out.println("from: " + from);
        System.out.println("to: " + to);
        System.out.println("message: " + message);
    }
}

