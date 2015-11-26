
/**
 * Write a description of class MailClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MailClient
{
    // instance variables - replace the example below with your own
    private MailServer server;
    private String user;

    /**
     * Constructor for objects of class MailClient
     */
    public MailClient(MailServer serverX ,String usuarioX )
    {
        // initialise instance variables
        server = serverX;
        user = usuarioX ;

    }

    /**
     * metodo que devuelve el ultimo mensaje de un usuario
     */
    public MailItem  getNextMailItem()
    {
        return server.getNextMailItem( user );

    }

    /**
     * imprimir por pantalla si el usuario tiene mensajes
     */
    public void printNextMailItem()
    {
        if (server.howManyMailItems(user) == 0) 
        {
            System.out.println (" Este usuario no tiene mensajes nuevos");
        }
        else 
        {
            MailItem newMail =  server.getNextMailItem( user );
            newMail.printMail();

        }
    }

    /**
     * envia el mensaje al receptor
     */
    public void sendMailItem(String receptor , String mensaje)
    {
        MailItem email = new MailItem(user,receptor,mensaje);
        server.post(email);
    }

}
