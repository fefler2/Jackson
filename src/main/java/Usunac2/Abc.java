package Usunac2;

public class Abc {
    public static void main(String[] args) {
        ShapeFactory shapeFactory =  new ShapeFactory();
        Shape shape = shapeFactory.getFactory("square");
    }
}
