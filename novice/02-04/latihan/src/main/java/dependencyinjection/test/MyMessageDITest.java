package dependencyinjection.test;

public class MyMessageDITest {

	public static void main(String[] args) {
		String msg = "Hi Supix";
		String email = "supi.core@gmail.com";
		String phone = "4088888888";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}
}