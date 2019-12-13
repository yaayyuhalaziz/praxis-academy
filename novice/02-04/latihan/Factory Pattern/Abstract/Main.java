/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory rShapeFactory = FactoryProducer.getFactory(true);
        
        Shape shape1 = rShapeFactory.getShape("Rectangle");
        shape1.draw();

        Shape shape2 = rShapeFactory.getShape("Square");
        shape2.draw();

        
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape3 = shapeFactory.getShape("Rectangle");
        shape3.draw();

        Shape shape4 = shapeFactory.getShape("Square");
        shape4.draw();
    }
}