package pl.com.silverstar.study.patterns.design;

import pl.com.silverstar.study.patterns.design.classes.Apply;
import pl.com.silverstar.study.patterns.design.classes.Filter;
import pl.com.silverstar.study.patterns.design.classes.FilterAdapter;
import pl.com.silverstar.study.patterns.design.classes.Waveform;

/**
 * Adapter (or Wrapper) pattern . It receives a given interface and returns the desired one. It is useful when we cannot
 * modify classes (e.g. classes from the outside library), which we want to use.
 * 
 * Based on "Thinking in Java" PL, ed. IV p. 276
 * 
 * @author SilverStar
 * 
 */
public class Adapter {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Waveform waveform = new Waveform();
        Apply.process(new FilterAdapter(new Filter.LowPass(20d)), waveform);
        Apply.process(new FilterAdapter(new Filter.HighPass(256.56d)), waveform);
        Apply.process(new FilterAdapter(new Filter.BandPass(30d, 305.89d)), waveform);

    }

}
