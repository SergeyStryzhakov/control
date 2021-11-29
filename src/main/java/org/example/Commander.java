package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Commander extends Human {
    int max_soldiers = 3;
    General general;
    List<Soldier> soldiers = new ArrayList<>();

    public Commander(String name, General general) {
        super(name);
        this.general = general;
    }

    public void addSoldier(Soldier soldier) {
        if (soldiers.size() == max_soldiers) {
            System.out.println("Maximum soldiers for commander " + this.name);
            return;
        }
        soldiers.add(soldier);
    }

    @Override
    public void report() throws InputMismatchException {
        System.out.println("General " + general.name + ", commander " + this.name + " ready!");
    }
}
