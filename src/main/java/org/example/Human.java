package org.example;

import java.util.InputMismatchException;

public abstract class Human implements ReadyToWar {
    final String name;
    public Human(String name) {
        this.name = name;
    }

    @Override
    public void canFight() throws InputMismatchException {
        System.out.println(this.name + " can fight!");
    }

    @Override
    public void report() throws InputMismatchException {
        System.out.println(this.name + " can report!");
    }
}
