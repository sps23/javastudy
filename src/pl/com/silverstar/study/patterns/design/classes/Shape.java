package pl.com.silverstar.study.patterns.design.classes;

public abstract class Shape {

    public abstract void draw();

    public abstract void erase();

    public static Shape factory(String type) throws BadShapeCreation {
        if ("Circle".equals(type)) {
            return new Circle();
        } else if ("Square".equals(type)) {
            return new Square();
        } else if ("Triangle".equals(type)) {
            return new Triangle();
        } else {
            throw new BadShapeCreation(type);
        }
    }

}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Circle.draw");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase");
    }

}

class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Square.draw");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase");
    }

}

class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Triangle.draw");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase");
    }

}
