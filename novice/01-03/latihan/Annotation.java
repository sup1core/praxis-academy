public class Annotation{
    @Deprecated
    public void Display(){
        System.out.println("Deprecated display()");
    }
    public static void main(String[] args) {
        Annotation an = new Annotation();
        an.Display();
    }
}