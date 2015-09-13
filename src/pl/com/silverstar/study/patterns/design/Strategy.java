package pl.com.silverstar.study.patterns.design;

import pl.com.silverstar.study.patterns.design.classes.Apply;
import pl.com.silverstar.study.patterns.design.classes.StringProcessor;


/**
 * Strategy design pattern lets to select the algorithm's behavior at runtime. It defines the family of algorithms,
 * encapsulates them and make them interchangeable.
 * 
 * Based on "Thinking in Java" PL, ed. IV p. 276
 * 
 * @author SilverStar
 * 
 */
public class Strategy {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String s = "Jeśli ona waży tyle, co kaczka, to znaczy że jest z drewna.";
        Apply.process(new StringProcessor.Upcase(), s);
        Apply.process(new StringProcessor.Lowcase(), s);
        Apply.process(new StringProcessor.Split(), s);

    }
}
