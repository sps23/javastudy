package pl.com.silverstar.study.patterns.design.classes;

import java.util.Arrays;

public abstract class StringProcessor implements Processor {

    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);

    public static class Upcase extends StringProcessor {

        @Override
        public String process(Object input) {
            return ((String) input).toUpperCase();
        }

    }

    public static class Lowcase extends StringProcessor {

        @Override
        public String process(Object input) {
            return ((String) input).toLowerCase();
        }

    }

    public static class Split extends StringProcessor {

        @Override
        public String process(Object input) {
            return Arrays.toString(((String) input).split(" "));
        }

    }
}
