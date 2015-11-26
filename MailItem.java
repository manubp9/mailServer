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
    private String to;
    // mensaje
    private String message;
    /**
      * Constructor que inicia las variables de MailItem
      */
    public MailItem(String de, String para, String mensaje)
     {
        // initialise instance variables
        x = 0;
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
    public String getFor()
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
}


