package org.example;

import java.util.ArrayList;
import java.util.List;

public class General extends Human{
    int max_commanders = 2;
    int age;
    private final List<Commander> commanders = new ArrayList<>();

    public General(String name, int age) {
        super(name);
        this.age = age;
    }

    public void addCommander(Commander commander) {
        if(commanders.size() == max_commanders) {
            System.out.println("Maximum commanders for general " + this.name);
            return;
        }
        commanders.add(commander);
    }
}
