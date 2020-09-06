package com.sashwat.java.general;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(String.format("args[%d]=%s", i, args[i]));
        }
    }
}
