package pl.com.silverstar.study.patterns.design.classes;

import java.util.ArrayList;
import java.util.Collection;

public class MailGenerator {

    public static Collection<Mail> generateAll() {
        Collection<Mail> mails = new ArrayList<Mail>();
        for (Mail.GeneralDelivery gd : Mail.GeneralDelivery.values()) {
            for (Mail.Scannability s : Mail.Scannability.values()) {
                for (Mail.Readability r : Mail.Readability.values()) {
                    for (Mail.Address a : Mail.Address.values()) {
                        for (Mail.ReturnAddess ra : Mail.ReturnAddess.values()) {
                            mails.add(new Mail(gd,s,r,a,ra));
                        }
                    }
                }
            }
        }
        return mails;
    }

}
