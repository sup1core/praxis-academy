package prototypepatterns;

import java.util.Hashtable;

/**
 * ShapeCache
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape (String shapeId){
        Shape canchedShape = shapeMap.get(shapeId);
        return (Shape) canchedShape.clone();
    }

    // for each shape run database query and create shape
   // shapeMap.put(shapeKey, shape);
   // for example, we are adding three shapes
   public static void loadCache(){
       Circle circle = new Circle();
       circle.setId("1");
       shapeMap.put(circle.getId(), circle);

       Square square = new Square();
       square.setId("2");
       shapeMap.put(circle.getId(), square);

       Rectangle rectangle = new Rectangle();
       rectangle.setId("3");
       shapeMap.put(circle.getId(), rectangle);
   }
}