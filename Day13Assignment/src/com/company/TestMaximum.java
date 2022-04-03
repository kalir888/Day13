package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMaximum {

    public static Float findMax(Float x, Float y, Float z) {
        Float max = x;
        if(x.compareTo(y) > 0)
            max = y;
        if(y.compareTo(z) > 0)
            max = z;
        return max;
    }

    public static void main(String[] args) {
      Float  floatMax = findMax(465.2f,6498.5f,496498.56f);
        System.out.println(floatMax);
        
    }
}
