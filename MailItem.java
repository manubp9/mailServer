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
    // crea un asunto
    private String subject;
    
    /**
     * Constructor que inicia las variables de MailItem
     */
    public MailItem(String from, String to, String message, String subject)
    {
        // initialise instance variables
        this.from = from;
        this.to = to;
        this.message = message;
        this.subject = subject;
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
        System.out.println("subject: " + subject);
    }
}

