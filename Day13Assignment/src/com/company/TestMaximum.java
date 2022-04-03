package com.company;

import java.util.ArrayList;
import java.util.List;

public class TestMaximum {

    public static void main(String[] args) {
        List integers = new ArrayList();
        integers.add(200);
        integers.add(500);
        integers.add(489);
        Class class1 = integers.get(0).getClass();
        String name = class1.getName();
        System.out.println(name);

        CompareMethod compare = new CompareMethod();

        Class class2 = compare.getClass();
        System.out.println(class2);
        String name2 = class2.getName();
        System.out.println(name2);

        System.out.println("The Maximum of three Strings is " + integers.get(2));


        
    }
}
