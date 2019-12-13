/**
 * ShapeFactory
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String strShapeType) {
        if(strShapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if(strShapeType.equalsIgnoreCase("Square")) {
            return new Square();
        } else {
            return null;
        }
    }
}