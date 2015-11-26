
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
    public MailClient(MailServer server ,String usuario )
    {
        // initialise instance variables
        this.server = server ;
        this.user = usuario ;

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
        MailItem email = getNextMailItem();
		if (email != null)
		{
			//Imprimimos los detalles del email
			email.printMail();
			
			System.out.println("De: " + email.getFrom());
			System.out.println("Destinatario: " + email.getTo());
			System.out.println("Mensaje" + email.getMessage());
		}
		else 
		{
			//Avisamos de que no hay emails en el servidor
			System.out.println("No hay correo nuevo");	
        }
    }

    /**
     * envia el mensaje al receptor
     */
    public void sendMailItem(String to , String message, String subject)
    {
        MailItem email = new MailItem(user,to,message, subject);
        server.post(email);
    }

}
