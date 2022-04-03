package com.company;

import java.util.ArrayList;
import java.util.List;

public class TestMaximum <T  extends Comparable> {
    T x,y,z,a,b,c;

    public TestMaximum(T x, T y, T z, T a, T b, T c) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T toFindMax() {
        T max = findMax(x,y,z,a,b,c);
        return max;
    }

    private static <T extends Comparable> T findMax(T x, T y, T z, T a, T b, T c) {
        List<T> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        list.add(z);
        list.add(a);
        list.add(b);
        list.add(c);
        list.sort(T::compareTo);
        return list.get(5);
    }

    public static void main(String[] args) {

        Integer intMax = new TestMaximum<Integer>(65465,654,4654,5456,5554,488).toFindMax();
        System.out.println(intMax);

        Float floatMax = new TestMaximum<Float>(45.145f,654.25f,5654.54f,5456.55f,4989.55f,464.54f).toFindMax();
        System.out.println(floatMax);

        String stringMax = new TestMaximum<String>("KaliMuthu", "Geetha", "Ramachandran","MuthuKumar", "Mugundhan", "Santhi").toFindMax();
        System.out.println(stringMax);
    }
}
