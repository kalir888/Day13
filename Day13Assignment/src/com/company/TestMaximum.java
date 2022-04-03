package com.company;

public class TestMaximum {
    
    public static Integer findMax(Integer x, Integer y, Integer z) {
        Integer intMax = x;
        if (y.compareTo(intMax) > 0)
            intMax = y;
        if (z.compareTo(intMax) > 0)
            intMax = z;
        return intMax;
    }

    public static Float findMax(Float x, Float y, Float z) {
        Float floatMax = x;
        if (y.compareTo(x) > 0)
            floatMax = y;
        if (z.compareTo(y) > 0)
            floatMax = z;
        return floatMax;
    }

    public static String findMax(String x, String y, String z) {
        String stringMax = x;
        if (y.compareTo(x) > 0)
            stringMax = y;
        if (z.compareTo(y) > 0)
            stringMax = z;
        return stringMax;
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
