package indi.twc.test.lambda.impl;

import java.util.Arrays;
import java.util.Comparator;

public class TestC {
    public static void main(String[] args) {
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

        // 1.1 使用匿名内部类根据 name 排序 players
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(players));

        // 1.2 使用 lambda expression 排序 players
        Arrays.sort(players, (o1, o2) -> o1.compareTo(o2));
        System.out.println(Arrays.toString(players));
    }
}
