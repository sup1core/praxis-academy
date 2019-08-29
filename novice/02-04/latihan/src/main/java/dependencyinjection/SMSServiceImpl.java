package dependencyinjection;

/**
 * SMSServiceImpl
 */
public class SMSServiceImpl implements MessageService{
    
    @Override
    public void sendMessage (String msg, String rcv){
        //logic to send SMS
        System.out.println("SMS sent to "+rcv+" with Message is "+msg);
    }
}