package dependencyinjection;

/**
 * EmailServiceImpl
 */
public class EmailServiceImpl {

    public void sendMessage(String msg, String rcv){
        //logic to send email
        System.out.println("Email sent to "+rcv+" with message is "+msg);
    }
}