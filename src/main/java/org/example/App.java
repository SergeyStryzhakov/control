package org.example;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        List<Human> army = new LinkedList<>();
        Human soldier1 = new Soldier("Soldier1", "Gun");
        Human soldier2 = new Soldier("Soldier2", "Gun");
        Human soldier3 = new Soldier("Soldier3", "Gun");
        Human soldier4 = new Soldier("Soldier4", "Gun");
        Human soldier5 = new Soldier("Soldier5", "Gun");
        Human soldier6 = new Soldier("Soldier6", "Gun");
        Human commander1 = new Commander("Commander1");
        Human commander2 = new Commander("Commander2");
        Human general = new General("General", 35);
        army.add(soldier1);
        army.add(soldier2);
        army.add(soldier3);
        army.add(soldier4);
        army.add(soldier5);
        army.add(soldier6);
        army.add(commander1);
        army.add(commander2);
        army.add(general);



        for (Human soldier: army) {
            soldier.canFight();
            soldier.report();
        }



    }
}
