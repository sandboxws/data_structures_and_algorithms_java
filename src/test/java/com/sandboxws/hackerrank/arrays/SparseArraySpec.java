package com.sandboxws.hackerrank.arrays;

import com.sandboxws.hackerrank.com.sandboxws.hackerrank.arrays.SparseArray;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static j8spec.J8Spec.describe;
import static j8spec.J8Spec.it;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(J8SpecRunner.class)
public class SparseArraySpec {{
    describe("Sparse Array", () -> {
        it("should print 7 \n 3", () -> {
            SparseArray sparseArray = new SparseArray();
            String output = "2\n1\n0";
            String[] words = new String[]{"aba", "baba", "aba", "xzxb"};
            String[] queries = new String[]{"aba", "xzxb", "ab"};
            assertThat(sparseArray.perform(words, queries), is(output));
        });
    });
}}
