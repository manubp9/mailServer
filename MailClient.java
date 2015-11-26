
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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public MailItem  getNextMailItem()
    {
        return server.getNextMailItem( user );
        
    }
}
