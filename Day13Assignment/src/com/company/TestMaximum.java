package com.company;

import java.util.ArrayList;
import java.util.List;

public class TestMaximum {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(589);
        integers.add(689);
        integers.add(100);
        integers.sort(Integer::compareTo);
        System.out.println("The Maximum of three numbers is " + integers.get(2));
    }
}
