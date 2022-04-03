package com.company;

public class TestMaximum {

    public static <T extends Comparable> T findMax(T x, T y,T z) {
        T max = x;
        if(y.compareTo(x) > 0)
            max = y;
        if(z.compareTo(y) > 0)
            max = z;
        return max;
    }

    public static void main(String[] args) {

        Integer intMax = findMax(65465, 654, 4654);
        System.out.println(intMax);

        Float floatMax = findMax(465.2f, 6498.5f, 496498.56f);
        System.out.println(floatMax);

        String stringMax = findMax("KaliMuthu", "Geetha", "Ramachandran");
        System.out.println(stringMax);
    }
}
