package com.company;

import java.util.ArrayList;
import java.util.List;

public class TestMaximum {
    public static String findMax(String x,String y,String z) {
        String stringMax = x;
        if(y.compareTo(x) > 0)
            stringMax = y;
        if(z.compareTo(y) > 0)
            stringMax = z;
        return stringMax;
    }
    public static void main(String[] args) {
        String stringMax = findMax("KaliMuthu","Geetha","Ramachandran");
        System.out.println(stringMax);
    }
}
