package pl.com.silverstar.study.patterns.design.classes;

public interface IShape {

    public abstract void draw();

    public abstract void erase();

}

class CirclePoly implements IShape {

    @Override
    public void draw() {
        System.out.println("Circle.draw");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase");
    }

    private static class Factory extends ShapeFactory {
        protected IShape create() {
            return new CirclePoly();
        }
    }

    static {
        ShapeFactory.addFactory("Circle", new CirclePoly.Factory());
    }

}

class SquarePoly implements IShape {

    @Override
    public void draw() {
        System.out.println("Square.draw");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase");
    }

    private static class Factory extends ShapeFactory {
        protected IShape create() {
            return new SquarePoly();
        }
    }

    static {
        ShapeFactory.addFactory("Circle", new SquarePoly.Factory());
    }

}

class TrianglePoly implements IShape {

    @Override
    public void draw() {
        System.out.println("Triangle.draw");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase");
    }

    private static class Factory extends ShapeFactory {
        protected IShape create() {
            return new TrianglePoly();
        }
    }

    static {
        ShapeFactory.addFactory("Circle", new TrianglePoly.Factory());
    }
}
