package dependencyinjection;

/**
 * MyApplication
 */
public class MyApplication {

//    private EmailService email = new EmailService();
    private EmailService email= null;
    /*
    start method for 
    */

    public MyApplication (EmailService svc){
        this.email=svc;
    }
    //end adding

    public void processMessage(String msg, String rcv){
        //do some msg validation, manipulation logic etc
        this.email.sendEmail(msg, rcv);
    }
}