package factorypatterns;

/**
 * FactoryPatternDemo
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Ractangle and call its draw method
        Shape shape2 = shapeFactory.getShape("RACTANGLE");
        //call draw method of Ractangle
        shape2.draw();

        //get an object of Squre
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}