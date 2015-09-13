package pl.com.silverstar.study.patterns.design;

import java.util.Date;

/**
 * Decorator pattern. Allows to add some new behavior to the class (at runtime) without affecting the class itself.
 * Disadvantage is that it can effectively work only with one layer of decoration. Even if it is possible to add more
 * than one layer of decoration only the last layer is defining the type and only its methods are visible.
 * 
 * Based on "Thinking in Java" PL, ed. IV p. 596
 * 
 * @author SilverStar
 * 
 */
public class Decorator {

    public static void main(String[] args) {
        TimeStampedDec t1 = new TimeStampedDec(new BasicDec());
        TimeStampedDec t2 = new TimeStampedDec(new SerialNumberedDec(new BasicDec()));

        t1.getStamp();
        t2.getStamp();

        SerialNumberedDec s1 = new SerialNumberedDec(new BasicDec());
        SerialNumberedDec s2 = new SerialNumberedDec(new TimeStampedDec(new BasicDec()));

        s1.getSerialNumber();
        s2.getSerialNumber();
    }

}

class BasicDec {
    private String value;

    public void set(String val) {
        this.value = val;
    }

    public String get() {
        return value;
    }
}

class DecoratorDec extends BasicDec {
    protected BasicDec basicDec;

    public DecoratorDec(BasicDec basicDec) {
        this.basicDec = basicDec;
    }

    public void set(String val) {
        this.basicDec.set(val);
    }

    public String get() {
        return this.basicDec.get();
    }
}

class TimeStampedDec extends DecoratorDec {
    public TimeStampedDec(BasicDec basicDec) {
        super(basicDec);
        this.timeStamp = new Date().getTime();
    }

    private final long timeStamp;

    public long getStamp() {
        return timeStamp;
    }

}

class SerialNumberedDec extends DecoratorDec {

    private static long counter = 1;
    private final long serialNumber = counter++;

    public long getSerialNumber() {
        return serialNumber;
    }

    public SerialNumberedDec(BasicDec basicDec) {
        super(basicDec);
    }
}