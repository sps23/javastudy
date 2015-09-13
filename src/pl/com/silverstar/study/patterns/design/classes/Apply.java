package pl.com.silverstar.study.patterns.design.classes;


/**
 * Applies a given strategy at runtime.
 */
public class Apply {

    public static void process(Processor p, Object s) {
        System.out.println("I use processor of type: " + p.name());
        System.out.println(p.process(s));
    }

}
