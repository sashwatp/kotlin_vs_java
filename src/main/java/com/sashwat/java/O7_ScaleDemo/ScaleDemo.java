package com.sashwat.java.O7_ScaleDemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ScaleDemo {

    public static void main(String[] args) {
        List<Thread> threadList = IntStream.rangeClosed(1, 100_000)
                .mapToObj(ScaleDemo::createThread)
                .collect(Collectors.toList());

        threadList.stream()
                .forEach((t) -> join(t));
    }

    private static void join(Thread t) {
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static Thread createThread(int i) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000L);
                System.out.print(".");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t.start();

        return t;
    }
}
