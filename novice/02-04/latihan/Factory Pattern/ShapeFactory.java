/**
 * ShapeFactory: Create a Factory to generate object of concrete class based on given information.
 */
public class ShapeFactory {
    public Shape getShape(String strShapeType) {
        if(strShapeType == null) {
            return null;
        }
        if(strShapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if(strShapeType.equalsIgnoreCase("Square")) {
            return new Square();
        } else if(strShapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else {
            return null;
        }
    }
}