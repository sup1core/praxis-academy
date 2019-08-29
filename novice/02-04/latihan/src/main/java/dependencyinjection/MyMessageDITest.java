package dependencyinjection;

/**
 * MyMessageDITest
 */
public class MyMessageDITest {

    public static void main(String[] args) {
        String msg="Hi Supix";
        String email="supi.core@gmail.com";
        String phone="+6285292529xxx";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //send sms
        injector = new SMSServiceInjector();
        app=injector.getConsumer();
        app.processMessages(msg, phone);
    }
}