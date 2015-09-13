package pl.com.silverstar.study.patterns.design;

import java.util.Map;

import pl.com.silverstar.study.patterns.design.classes.AlarmPoints;
import pl.com.silverstar.study.patterns.design.classes.EnumMaps;
import pl.com.silverstar.study.patterns.design.classes.ICommand;

/**
 * The idea of Command pattern is to create interface with usually one method and provide many implementations of it.
 * 
 * 
 * Based on "Thinking in Java" PL, ed. IV p. 843
 * 
 * @author SilverStar
 *
 */
public class Command {

    /**
     * @param args
     */
    public static void main(String[] args) {
        EnumMaps eMaps = new EnumMaps();
        for(Map.Entry<AlarmPoints, ICommand> entry : eMaps.getEm().entrySet()) {
            System.out.println(entry.getKey() + " : ");
            entry.getValue().action();
        }
    }

}
