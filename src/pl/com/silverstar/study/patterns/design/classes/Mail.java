package pl.com.silverstar.study.patterns.design.classes;

public class Mail {

    GeneralDelivery generalDelivery;
    Scannability scannability;
    Readability readability;
    Address address;
    ReturnAddess returnAddess;

    static long counter = 0;
    final long id = counter++;

    public Mail() {
    }

    public Mail(GeneralDelivery generalDelivery, Scannability scannability, Readability readability, Address address,
            ReturnAddess returnAddess) {
        this.generalDelivery = generalDelivery;
        this.scannability = scannability;
        this.readability = readability;
        this.address = address;
        this.returnAddess = returnAddess;
    }

    @Override
    public String toString() {
        return "Mail [id=" + id + "]";
    }

    public String details() {
        return "Mail [generalDelivery=" + generalDelivery + ", scannability=" + scannability + ", readability="
                + readability + ", address=" + address + ", returnAddess=" + returnAddess + ", id=" + id + "]";
    }

    enum GeneralDelivery {
        YES, NO
    };

    enum Scannability {
        UNSCANNABLE, YES
    };

    enum Readability {
        ILLEGIBLE, YES
    };

    enum Address {
        INCORRECT, OK
    };

    enum ReturnAddess {
        MISSING, OK
    };

}
