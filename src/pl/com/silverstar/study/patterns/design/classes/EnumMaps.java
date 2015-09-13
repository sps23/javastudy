/**
 * 
 */
package pl.com.silverstar.study.patterns.design.classes;

import java.util.EnumMap;

public class EnumMaps {

    EnumMap<AlarmPoints, ICommand> em;

    public EnumMaps() {
        initEM();
    }

    public void initEM() {

        em = new EnumMap<AlarmPoints, ICommand>(AlarmPoints.class);

        em.put(AlarmPoints.KITCHEN, new ICommand() {
            public void action() {
                // put specific action here
                System.out.println("Fire in the kitchen !!!");
            }
        });

        em.put(AlarmPoints.STAIR1, new ICommand() {
            public void action() {
                System.out.println("Fire on the front staircase !!!");
            }
        });

        em.put(AlarmPoints.LOBBY, new ICommand() {
            public void action() {
                System.out.println("Fire in the lobby !!!");
            }
        });

    }

    public EnumMap<AlarmPoints, ICommand> getEm() {
        return em;
    }

    public void setEm(EnumMap<AlarmPoints, ICommand> em) {
        this.em = em;
    }

}
