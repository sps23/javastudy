package pl.com.silverstar.study.patterns.design.classes;

public class Waveform {
    private static long counter;
    private final long id = counter++;
    String action;

    @Override
    public String toString() {
        return "Waveform [id=" + id + ", action: " + action + "]";
    }

}