package pl.com.silverstar.study.patterns.design.classes;

/**
 * Class generates the desired interface Processor form required interface Filter. It is implementation of Adapter
 * (Wrapper) pattern.
 * 
 * @author SilverStar
 * 
 */
public class FilterAdapter implements Processor {

    Filter filter;

    public FilterAdapter(Filter filter) {
        super();
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
