package com.sandboxws.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings, check to see if they are anagrams.
 * An anagram is when the two strings can be written using the exact same letters
 * (so you can just rearrange the letters to get a different phrase or word).
 * For example:
 * "public relations" is an anagram of "crap built on lies."
 * "clint eastwood" is an anagram of "old west action"
 * Note: Ignore spaces and capitalization. So "d go" is an anagram of "God" and "dog" and "o d g".
 */
public class StringAnagram {
    public boolean anagram(String s1, String s2) {
        boolean result = true;

        s1 = s1.replaceAll(" ", "").toLowerCase();
        s2 = s2.replaceAll(" ", "").toLowerCase();

        if (s1.length() != s2.length())
            result = false;

        Map<Character, Integer> letters = new HashMap<Character, Integer>();

        char[] s1Letters = s1.toCharArray();
        for (int i = 0; i < s1Letters.length; i++) {
            char letter = s1Letters[i];
            if(letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }
        }

        char[] s2Letters = s2.toCharArray();
        for(int i = 0; i < s2Letters.length; i++) {
            char letter = s2Letters[i];
            if(!letters.containsKey(letter)) {
                result = false;
                break;
            }
        }

        return result;
    }
}
