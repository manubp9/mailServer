
/**
 * Write a description of class MailClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class MailClient
{
	//El servidor al que esta conectado este cliente
	private MailServer server;
	//La direccion del usuario que esta usando este cliente
	private String user;
	//El ultimo email recibido
	private MailItem lastMail;
	//contador de spam
	private int spam;

	/**
	 * Crea un objeto MailClient a partir de los valores dados
	 */
	public MailClient(MailServer server, String user)
	{
		this.user = user;
		this.server = server;
		lastMail = null;
	}

	/**
	 * Recupera del servidor el siguiente email destinado
	 * al usuario que esta usando el cliente. Si no hay 
	 * ningun email pendiente de ser descargado devuelve null; si
	 * lo hay, devuelve el email
	 */
	public MailItem getNextMailItem()
	{
        MailItem mail = server.getNextMailItem(user);
        if (mail != null) {
            String mensaje = mail.getMessage();
            if (mensaje.contains("trabajo")) {
            }
            else if (mensaje.contains("regalo") || mensaje.contains("promocion")) {
                spam = spam + 1;
                mail = null;
            }
            if (mail != null) {
                lastMail = mail;
            }
        }
        return mail;
    }
	/**
	 * Recupera del servidor el siguiente email destinado al
	 * usuario que esta usando el cliente e imprime sus datos
	 * por pantalla. Si no hay ningun email imprime por pantalla
	 * un mensaje advirtiendo de ello
	 */
	public void printNextMailItem()
	{
	    MailItem item = server.getNextMailItem(user);
        String mensaje = item.getMessage();
        if (mensaje.contains("trabajo"))
        {
            item.print();
        }
        else{
            if(mensaje.contains("regalo") || (mensaje.contains("promocion")))
            {
                System.out.println ("El mensaje recibido es un spam");
                spam = spam + 1;

            }
            else 
            {
                item.print();
            }

        }

    }

	/**
	 * Permite redactar un email indicando el destinatario y el
	 * cuerpo del mensaje y enviarlo al servidor
	 */
	public void sendMailItem(String to, String message, String subject)
	{
		MailItem email = new MailItem(user, to, message, subject);
		server.post(email);
	}
	
		
	/**
	 * Muestra por pantalla el numero de mensajes pendientes de
	 * descargar en el servidor para el usuario actual
	 */
	public void howManyMailItemsIHave()
	{
		System.out.println("Emails pendientes en el servidor: " + 
		                   server.howManyMailItems(user));
	}
	
	/**
	 * Recibe un correo y responde automaticamente indicando
	 * que estamos fuera de la oficina
	 */
	public void getNextMailItemAndSendAutomaticRespond()
	{	
		MailItem email = getNextMailItem();
		if (email != null)
		{
			sendMailItem(email.getFrom(),
			             "No estoy en la oficina. \n" + email.getMessage(),
			             "RE: " + email.getSubject());
		}
	}
	
	/**
	 * Muestra por pantalla los datos del ultimo email recibido.
	 * En caso de no haber recibido aun ningun email, informa de ello.
	 */
	public void muestraUltimoEmail() 
	{
		if(lastMail != null) {
			lastMail.print();
		}
		else {
			System.out.println("No hay ning�n mensaje.");
		}
	}
	/**
	 * Muestra por pantalla los datos del ultimo email recibido.
	 * En caso de no haber recibido aun ningun email, informa de ello.
	 */
	public void () 
}
