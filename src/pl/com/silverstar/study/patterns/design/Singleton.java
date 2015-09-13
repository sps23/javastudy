package pl.com.silverstar.study.patterns.design;

public class Singleton {

    private static Singleton s = new Singleton();

    private Singleton() {
        // private constructor
    }

    public static Singleton access() {
        return s;
    }

    public void f() {
        // TODO do sth
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
