package org.example;

import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Human> army = new LinkedList<>();
        General general = new General("General", 35);
        Commander commander1 = new Commander("Commander1", general);
        Commander commander2 = new Commander("Commander2", general);
        Commander commander3 = new Commander("Commander3", general);
        Soldier soldier1 = new Soldier("Soldier1", "Gun",commander1);
        Soldier soldier2 = new Soldier("Soldier2", "Gun",commander1);
        Soldier soldier3 = new Soldier("Soldier3", "Gun",commander1);
        Soldier soldier4 = new Soldier("Soldier4", "Gun",commander2);
        Soldier soldier5 = new Soldier("Soldier5", "Gun",commander2);
        Soldier soldier6 = new Soldier("Soldier6", "Gun",commander2);


        general.addCommander(commander1);
        general.addCommander(commander2);
general.addCommander(commander3);

        army.add(soldier1);
        army.add(soldier2);
        army.add(soldier3);
        army.add(soldier4);
        army.add(soldier5);
        army.add(soldier6);
        army.add(commander1);
        army.add(commander2);
        army.add(general);


        for (Human soldier : army) {
            soldier.canFight();
            soldier.report();
        }


    }
}
