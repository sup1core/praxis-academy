package abstractfactory;

/**
 * AbstractFactoryPatternDemo
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //get rounded shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        //get an object of Shape Rounded Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        //call draw method of shape rectangle
        shape1.draw();

        //get an object of Share Rounded Square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        //get rounded shape factory and call draw method
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();

        //get an object of shape square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();
    }
}