/**
 * AnnotationOveride
 */
class AnnotationOverride {

    public void Display(){
        System.out.println("Annotation Override");
    }
    public static void main(String[] args) {
        AnnotationOverride t1 = new Derived();
        t1.Display();
    }
}

class Derived extends AnnotationOverride {
    @Override
    public void Display() {
        System.out.println("Derived Disply");
    }
}