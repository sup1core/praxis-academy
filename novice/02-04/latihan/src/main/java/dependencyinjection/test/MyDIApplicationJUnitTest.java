package dependencyinjection.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dependencyinjection.Consumer;
import dependencyinjection.MessageService;
import dependencyinjection.MessageServiceInjector;
import dependencyinjection.MyDIApplication;

/**
 * MyDIApplicationJUnitTest
 */
public class MyDIApplicationJUnitTest {

    private MessageServiceInjector injector;

    @Before
    public void setUp(){
        //mock the injector with anonymous class
        injector = new MessageServiceInjector(){

            @Override
            public Consumer getConsumer(){
                //mock the message service
                return new MyDIApplication(new MessageService(){
                    
                    @Override
                    public void sendMessage(String msg, String rcv){
                        System.out.println("Mock message service implementation");
                    }
                });
            }
        };
    }

    @Test
    public void test(){
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Hi Supix","supi.core@gmail.com");
    }

    @After
    public void tear(){
        injector = null;
    }
}