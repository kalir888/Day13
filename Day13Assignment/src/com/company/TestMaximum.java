package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMaximum {

    public static void main(String[] args) {
        List<Float> integers = new ArrayList<>();
        integers.add(100.5f);
        integers.add(102.5f);
        integers.add(50.5f);
        integers.sort(Float::compareTo);
        System.out.println("The Maximum of three numbers is " + integers.get(2));
        
    }
}
