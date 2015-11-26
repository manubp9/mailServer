/**
  * clase que contiene un mensaje.
  * 
  */
 public class MailItem
 {
    // instance variables - replace the example below with your own
    private int x;
    // quien envia el mensaje
    private String from;
    // receptor del mensaje
    private String for;
    // mensaje
    private String message;
    /**
      * Constructor que inicia las variables de MailCcilent
      */
    public MailClient(String de, String para, String mensaje)
     {
        // initialise instance variables
        x = 0;
        from = de;
        for = para;
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
    public String getFor()
    {
        return for;
    }
    /**
     * Método que devuelve la cadena almacenada en from
     */
    public String getMessage()
    {
        return message;
    }


