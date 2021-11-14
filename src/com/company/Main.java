package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{-4, 11, 7, -12, 6, 11};

        Arrays.sort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}