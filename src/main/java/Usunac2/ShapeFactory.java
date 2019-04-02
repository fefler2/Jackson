package Usunac2;

public class ShapeFactory {
    public  Shape getFactory(String shapeType){
        if (shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        if (shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }
        return null;
    }
}
