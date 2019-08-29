package factorypatterns;

/**
 * ShareFactory
 */
public class ShapeFactory {

    //use getShare method to get object od type share
    public Shape getShape(String shapeType){
        if (shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RACTANGLE")){
            return new Ractangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}