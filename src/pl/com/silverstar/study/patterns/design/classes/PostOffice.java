package pl.com.silverstar.study.patterns.design.classes;

/**
 * Implementation of ChainOfResposibility pattern, where chain is represented by the enumeration {@link MailHandler}.
 * 
 * @author SilverStar
 *
 */
public class PostOffice {

    enum MailHandler {
        GENERAL_DELIVERY {
            boolean handle(Mail m) {
                switch (m.generalDelivery) {
                case YES:
                    System.out.println(m + " - poste restante");
                    return true;
                default:
                    return false;
                }
            }
        },
        MACHINE_SCAN {
            boolean handle(Mail m) {
                switch (m.scannability) {
                case UNSCANNABLE:
                    return false;
                default:
                    switch (m.address) {
                    case INCORRECT:
                        return false;
                    default:
                        System.out.println(m + " - machine service");
                        return true;
                    }
                }
            }
        },
        VISUAL_INSPECTION {
            boolean handle(Mail m) {
                switch (m.readability) {
                case ILLEGIBLE:
                    return false;
                default:
                    switch (m.address) {
                    case INCORRECT:
                        return false;
                    default:
                        System.out.println(m + " - manual service");
                        return true;
                    }
                }
            }
        },
        RETURN_TO_SENDER {
            boolean handle(Mail m) {
                switch (m.returnAddess) {
                case MISSING:
                    return false;
                default:
                    System.out.println(m + " - returned to sender");
                    return true;
                }
            }
        };

        abstract boolean handle(Mail m);

    }

    public static void handle(Mail m) {
        for (MailHandler handler : MailHandler.values()) {
            if (handler.handle(m)) {
                return;
            }
        }
        System.out.println(m + " - dead mail");
    }
}
