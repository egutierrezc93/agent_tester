package com.runfalcon.agent_tester;

import java.util.Random;

public class MyClass {

    private String myString;

    public MyClass() {
        this.myString = getRandomString();
    }

    private static String getRandomString() {
        Random rmd = new Random();
        int count = 1 + rmd.nextInt(27);
        String s = "";
        for (int index = 1; index <= count; index++){
            s += Character.toString(64 + index);
        }
        return s;
    }
}
