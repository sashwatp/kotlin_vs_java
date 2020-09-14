package com.sashwat.java.O7_ScaleDemo;

import java.util.ArrayList;
import java.util.List;

public class ScaleDemo {

    public static void main(String[] args) throws Exception {
        List<Thread> a = new ArrayList<>();
        for (int i = 1; i < 10000; i++) {
            Thread t = new Thread(() -> {
                try {
                    Thread.sleep(1000L);
                    System.out.print(".");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });

            a.add(t);

            t.start();
        }

        a.stream()
                .forEach((t) -> {
                    try {
                        t.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });

    }
}
