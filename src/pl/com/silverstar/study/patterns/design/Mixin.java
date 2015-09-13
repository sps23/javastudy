package pl.com.silverstar.study.patterns.design;

import java.util.Date;

/**
 * Mixin is a class which contains a combination of methods from other classes. It is done not by inheritance.
 * 
 * Based on "Thinking in Java" PL, ed. IV p. 594
 * 
 * @author SilverStar
 * 
 */
public class Mixin extends BasicImpl implements TimeStamped, SerialNumbered {

    private TimeStamped timeStamped = new TimeStampedImpl();
    private SerialNumbered serialNumbered = new SerialNumberedImpl();

    @Override
    public long getSerialNumber() {
        return serialNumbered.getSerialNumber();
    }

    @Override
    public long getStamp() {
        return timeStamped.getStamp();
    }

    public static void main(String[] args) {
        Mixin mixin1 = new Mixin();
        mixin1.set("test 1");
        System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber());

        Mixin mixin2 = new Mixin();
        mixin2.set("test 2");
        System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber());
    }

}

interface TimeStamped {
    long getStamp();
}

interface SerialNumbered {
    long getSerialNumber();
}

interface Basic {
    public void set(String val);

    public String get();
}

class TimeStampedImpl implements TimeStamped {
    private final long timeStamp;

    public TimeStampedImpl() {
        this.timeStamp = new Date().getTime();
    }

    @Override
    public long getStamp() {
        return timeStamp;
    }

}

class SerialNumberedImpl implements SerialNumbered {
    private static long counter = 1;
    private final long serialNumber = counter++;

    @Override
    public long getSerialNumber() {
        return serialNumber;
    }

}

class BasicImpl implements Basic {
    private String value;

    @Override
    public void set(String val) {
        this.value = val;
    }

    @Override
    public String get() {
        return value;
    }
}