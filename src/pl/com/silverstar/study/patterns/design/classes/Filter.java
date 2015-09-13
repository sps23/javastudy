package pl.com.silverstar.study.patterns.design.classes;

public class Filter {

    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
    
    public static class LowPass extends Filter {
        double cutoff;

        public LowPass(double cutoff) {
            super();
            this.cutoff = cutoff;
        }

        public Waveform process(Waveform input) {
            input.action = name() + " at cutoff = " + cutoff;
            return input;
        }
    }

    public static class HighPass extends Filter {
        double cutoff;

        public HighPass(double cutoff) {
            super();
            this.cutoff = cutoff;
        }

        public Waveform process(Waveform input) {
            input.action = name() + " at cutoff = " + cutoff;
            return input;
        }
    }

    public static class BandPass extends Filter {
        double lowCutoff, highCutoff;

        public BandPass(double lowCutoff, double highCutoff) {
            super();
            this.lowCutoff = lowCutoff;
            this.highCutoff = highCutoff;
        }

        public Waveform process(Waveform input) {
            input.action = name() + " at band = [" + lowCutoff + "; " + highCutoff + "]";
            return input;
        }
    }
}