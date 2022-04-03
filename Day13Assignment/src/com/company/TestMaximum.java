package com.company;

public class TestMaximum <T  extends Comparable> {
    T x,y,z;

    public TestMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T toFindMax() {
        T max = findMax(x,y,z);
        return max;
    }

    private static <T extends Comparable> T findMax(T x, T y, T z) {
        T max = x;
        if(y.compareTo(x) > 0)
            max = y;
        if(z.compareTo(y) > 0)
            max = z;
        return max;
    }

    public static void main(String[] args) {

        Integer intMax = new TestMaximum<Integer>(65465,654,4654).toFindMax();
        System.out.println(intMax);

        Float floatMax = new TestMaximum<Float>(45.145f,654.25f,5654.54f).toFindMax();
        System.out.println(floatMax);

        String stringMax = new TestMaximum<String>("KaliMuthu", "Geetha", "Ramachandran").toFindMax();
        System.out.println(stringMax);
    }
}
