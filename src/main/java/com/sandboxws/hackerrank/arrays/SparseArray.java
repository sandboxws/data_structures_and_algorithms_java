package com.sandboxws.hackerrank.com.sandboxws.hackerrank.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.out;

public class SparseArray {
    public static void main(String[] args) {
        ArrayList<ArrayList> x = new ArrayList();
        Scanner scan = new Scanner(System.in);
        int wordsCount = Integer.parseInt(scan.nextLine());
        String[] words = new String[wordsCount];
        for (int i = 0; i < wordsCount; i++) {
            words[i] = scan.nextLine();
        }

        int queriesCount = Integer.parseInt(scan.nextLine());
        String[] queries = new String[queriesCount];
        for (int i = 0; i < queriesCount; i++) {
            queries[i] = scan.nextLine();
        }

        out.println(new SparseArray().perform(words, queries));
    }

    public String perform(String[] words, String[] queries) {
        String output = "";
        HashMap<String, Integer> occurrences = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(!occurrences.containsKey(word)) {
                occurrences.put(word, 1);
            } else {
                occurrences.put(word, occurrences.get(word) + 1);
            }
        }

        for (int i = 0; i < queries.length; i++) {
            if(occurrences.containsKey(queries[i])) {
                output += occurrences.get(queries[i]) + "\n";
            } else {
                output += "0\n";
            }
        }

        output = output.trim();

        return output;
    }
}
