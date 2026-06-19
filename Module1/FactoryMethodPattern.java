class Circle {
    void draw() {
        System.out.println("Circle drawn");
    }
}

class Rectangle {
    void draw() {
        System.out.println("Rectangle drawn");
    }
}

class ShapeFactory {

    public Object getShape(String type) {

        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } 
        else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }

        return null;
    }
}

public class FactoryMethodPattern {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Circle c = (Circle) factory.getShape("circle");
        c.draw();

        Rectangle r = (Rectangle) factory.getShape("rectangle");
        r.draw();
    }
}