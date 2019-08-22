class DeprecatedTest
 {
    @Deprecated
    public void Display()
     {
        System.out.println("Deprecatedtest display()");
     }
 }
public class AnnotationSuppressWarning
 {   
    @SuppressWarnings({"checked", "deprecation"})
     public static void main(String args[])
     {
         DeprecatedTest d1 = new DeprecatedTest();
         d1.Display();
      }
  }