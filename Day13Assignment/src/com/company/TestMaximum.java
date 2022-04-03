package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMaximum {

    public static Integer findMax(Integer x, Integer y, Integer z) {
        Integer max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;
        return max;
    }

    public static void main(String[] args) {

        
    }
}
