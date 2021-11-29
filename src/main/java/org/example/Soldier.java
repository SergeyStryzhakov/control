package org.example;

import java.util.InputMismatchException;

public class Soldier extends Human {
    private String weapon;

    public Soldier(String name, String weapon) {
        super(name);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void report() throws InputMismatchException {
        System.out.println(this.name + " ready with " + weapon);
    }
}
