package com.sandboxws.hackerrank.com.sandboxws.hackerrank.arrays;

import java.util.Scanner;
import static java.lang.System.out;

/**
 * Challenge description <a href="https://www.hackerrank.com/challenges/arrays-ds">Arrays-DS</a>
 */
public class ArraysDS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] array = scan.nextLine().split(" ");
        scan.close();

        ArraysDS arraysDS = new ArraysDS();
        out.println(arraysDS.perform(n, array));
    }

    public String perform(int n, String[] array) {
        String output = "";

        while(--n >= 0) {
            output += array[n] + " ";
        }

        return output.trim();
    }
}
