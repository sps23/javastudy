package pl.com.silverstar.study.patterns.design.classes;

import java.util.HashMap;
import java.util.Map;

public abstract class ShapeFactory {

    private static Map<String, ShapeFactory> factories = new HashMap<String, ShapeFactory>();

    protected abstract IShape create();

    public static void addFactory(String id, ShapeFactory factory) {
        factories.put(id, factory);
    }

    public static final IShape createShape(String id) throws BadShapeCreation {
        if (!factories.containsKey(id)) {
            try {
                // Load dynamically
                Class.forName("study.patterns.design.classes." + id);
            } catch (ClassNotFoundException e) {
                throw new BadShapeCreation(id);
            }
            // See if it was put in:
            if (!factories.containsKey(id)) {
                throw new BadShapeCreation(id);
            }
        }
        return ((ShapeFactory) factories.get(id)).create();
    }

}
