/**
 * RoundedShapeFactory
 */
public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String strShapeType) {
        if(strShapeType.equalsIgnoreCase("Rectangle")) {
            return new RoundedRectangle();
        } else if(strShapeType.equalsIgnoreCase("Square")) {
            return new RoundedSquare();
        } else {
            return null;
        }
    }
}