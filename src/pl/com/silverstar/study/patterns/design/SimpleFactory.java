package pl.com.silverstar.study.patterns.design;

import java.util.ArrayList;
import java.util.List;

import pl.com.silverstar.study.patterns.design.classes.BadShapeCreation;
import pl.com.silverstar.study.patterns.design.classes.Shape;

public class SimpleFactory {

    String shapeNames[] = { "Circle", "Square", "Triangle", "Parallelogram", "Circle" };

    List<Shape> shapes = new ArrayList<Shape>();

    public SimpleFactory() {
        super();
        for (String s : shapeNames) {
            try {
                shapes.add(Shape.factory(s));
            } catch (BadShapeCreation e) {
                e.printStackTrace(System.err);
            }
        }
    }

    public static void main(String[] args) {
        SimpleFactory sf1 = new SimpleFactory();
        for(Shape s : sf1.shapes) {
            s.draw();
            s.erase();
        }
    }

}
