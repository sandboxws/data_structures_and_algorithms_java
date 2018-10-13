package com.sandboxws.hackerrank.com.sandboxws.hackerrank.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import static java.lang.System.out;

/**
 * Challenge description <a href="https://www.hackerrank.com/challenges/dynamic-array">Dynamic Array</a>
 */
public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<ArrayList> x = new ArrayList();
        Scanner scan = new Scanner(System.in);
        String firstLine = scan.nextLine();
        String[] input = firstLine.split("\\s+");
        int N = Integer.parseInt(input[0]);

        int n = Integer.parseInt(input[1]);
        String[] queries = new String[n];
        for (int i = 0; i < n; i++) {
            queries[i] = scan.nextLine();
        }

        scan.close();

        DynamicArray dynamicArray = new DynamicArray();
        out.println(dynamicArray.perform(N, queries));
    }

    public String perform(int N, String[] queries) {
        String output = "";
        HashMap<Integer, ArrayList> seqList = new HashMap<>();
        int lastAns = 0;

        for (int i = 0; i < queries.length; i++) {
            String[] queryData = queries[i].split("\\s+");
            int seq = (Integer.parseInt(queryData[1]) ^ lastAns) % N;
            switch (Integer.parseInt(queryData[0])) {
                case 1:
                    if(!seqList.containsKey(seq)) {
                        seqList.put(seq, new ArrayList());
                    }

                    seqList.get(seq).add(Integer.parseInt(queryData[2]));
                    break;

                case 2:
                    int idx = Integer.parseInt(queryData[2]) % seqList.get(seq).size();
                    lastAns = (Integer) seqList.get(seq).get(idx);
                    output += lastAns + "\n";
                    break;
            }
        }

        return output.trim();
    }
}
