package dependencyinjection;

/**
 * MyLegacyTest
 */
public class MyLegacyTest {

    public static void main(String[] args) {
        MyApplication app = new MyApplication();
        app.processMessage("Hi SPX", "supi.core@gmail.com");
    }
}