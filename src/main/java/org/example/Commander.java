package org.example;

import java.util.ArrayList;
import java.util.List;

public class Commander extends Human{
    int max_soldiers = 3;
     List<Soldier> soldiers = new ArrayList<>();

    public Commander(String name) {
        super(name);
    }

    public void addSoldier(Soldier soldier) {
        if(soldiers.size() == max_soldiers) {
            System.out.println("Maximum soldiers for commander " + this.name);
            return;
        }
        soldiers.add(soldier);

    }

}
