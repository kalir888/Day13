package com.company;

import java.util.ArrayList;
import java.util.List;

public class TestMaximum {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Geetha");
        strings.add("Kalimuthu");
        strings.add("Ramachandran");
        strings.sort(String::compareTo);
        System.out.println("The Maximum of three Strings is " + strings.get(2));
        
    }
}
