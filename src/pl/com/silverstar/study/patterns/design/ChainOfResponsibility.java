package pl.com.silverstar.study.patterns.design;

import pl.com.silverstar.study.patterns.design.classes.Mail;
import pl.com.silverstar.study.patterns.design.classes.MailGenerator;
import pl.com.silverstar.study.patterns.design.classes.PostOffice;

/**
 * ChainOfResposibility assumes creation of several of different problem solving methods and connecting them into chain.
 * The request is processed in sequence until the problem is solved.
 * 
 * Based on "Thinking in Java" PL, ed. IV p. 848
 * 
 * @author SilverStar
 *
 */
public class ChainOfResponsibility {

    public static void main(String[] args) {
        System.out.println("PostOffice -  example for all possible mails:");
        for(Mail m : MailGenerator.generateAll()) {
            System.out.println(m.details());
            PostOffice.handle(m);
            System.out.println("@@@@@@@@@@@@@@");
        }
    }

}
