package singletonpatterns;

/**
 * SingleObject
 */
public class SingleObject {
    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    /*
    make the contructor private so that this class cannot be instantiated
    */
    private SingleObject(){}

    //get the only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello SPX");
    }
}