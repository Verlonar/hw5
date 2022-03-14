package ru.verlonar;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        split();

        //------------------------------------------------------------------------------
        //задача 1
        int[] ints = new int[] {1, 2, 3};

        double[] doubles = {1.57, 7.654, 9.986};

        String[] strings = {"one", "two", "three"};

        //------------------------------------------------------------------------------
        //задача 2
        StringBuilder result = new StringBuilder();
        for(int i : ints) {
            result.append(i).append(",");
        }
        write(result.toString());

        result = new StringBuilder();

        for(double i : doubles) {
            result.append(i).append(",");
        }
        write(result.toString());

        result = new StringBuilder();

        for(String i : strings) {
            result.append(i).append(",");
        }
        write(result.toString());

        split();

        //------------------------------------------------------------------------------
        //задача 3

        result = new StringBuilder();

        for (int i = 2; i >= 0; i--) {
            result.append(ints[i]).append(",");
        }
        write(result.toString());

        result = new StringBuilder();

        for (int i = 2; i >= 0; i--) {
            result.append(doubles[i]).append(",");
        }
        write(result.toString());

        result = new StringBuilder();

        for (int i = 2; i >= 0; i--) {
            result.append(strings[i]).append(",");
        }
        write(result.toString());

        split();

        //------------------------------------------------------------------------------
        //задание 4
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                ints[i] = ints[i] + 1;
            }
        }

        System.out.println(Arrays.toString(ints));

        split();
    }

    private static void write(String s) {
        System.out.println(s.substring(0, s.length() - 1));
    }

    private static void split() {
        System.out.println("------------------------------------");
    }

}
