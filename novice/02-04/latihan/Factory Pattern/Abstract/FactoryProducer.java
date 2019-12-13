/**
 * FactoryProducer: Create a Factory generator/producer class to get factories by passing an information such as Shape.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(boolean isRounded) {
        if(isRounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}