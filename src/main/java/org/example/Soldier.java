package org.example;

import java.util.InputMismatchException;

public class Soldier extends Human {
    private String weapon;
    Commander commander;

    public Soldier(String name, String weapon, Commander commander) {
        super(name);
        this.weapon = weapon;
        this.commander = commander;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void report() throws InputMismatchException {
        System.out.println(this.name + " ready with " + weapon + " Commander " + commander.name);
    }
}
