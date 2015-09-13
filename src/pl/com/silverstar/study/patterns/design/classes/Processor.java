package pl.com.silverstar.study.patterns.design.classes;

/**
 * Defines a family of algorithms. Interface implemented by specific strategy.
 * 
 */
public interface Processor {
    String name();

    Object process(Object input);
}
