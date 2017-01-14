package com.sandboxws.hackerrank.com.sandboxws.hackerrank.arrays;

import java.util.*;

import static java.lang.System.out;

public class LeftRotation {
    public static void main(String[] args) {
        ArrayList<ArrayList> x = new ArrayList();
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        String[] array = scan.nextLine().split(" ");
        int rotations = Integer.parseInt(input[1]);
        scan.close();

        out.println(new LeftRotation().perform(rotations, array));
    }

    public String perform(int rotations, String[] array) {
        int size = array.length;
        int modRotations = rotations % size;
        String[] output = new String[size];
        for (int i = 0; i < size; i++) {
            if (i - modRotations < 0) {
                output[i - modRotations + size] = array[i];
            } else {
                output[i - modRotations] = array[i];
            }
        }

        return String.join(" ", output);
    }
}
