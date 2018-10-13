package com.sandboxws.problems;

import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static j8spec.J8Spec.describe;
import static j8spec.J8Spec.it;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(J8SpecRunner.class)
public class StringAnagramSpec {{
    describe("string anagram", () -> {
        it("client eastwood is anagram of old west action", () -> {
            StringAnagram stringAnagram = new StringAnagram();
            String s1 = "clint eastwood";
            String s2 = "old west action";
            assertThat(stringAnagram.anagram(s1, s2), is(true));
        });

        it("public relations is anagram of crap built on lies", () -> {
            StringAnagram stringAnagram = new StringAnagram();
            String s1 = "public relations";
            String s2 = "crap built on lies";
            assertThat(stringAnagram.anagram(s1, s2), is(true));
        });
    });
}}
