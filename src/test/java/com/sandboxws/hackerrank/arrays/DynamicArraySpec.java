package com.sandboxws.hackerrank.arrays;

import com.sandboxws.hackerrank.com.sandboxws.hackerrank.arrays.DynamicArray;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static j8spec.J8Spec.describe;
import static j8spec.J8Spec.it;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(J8SpecRunner.class)
public class DynamicArraySpec {{
    describe("Dynamic Array", () -> {
        it("should print 7 \n 3", () -> {
            DynamicArray dynamicArray = new DynamicArray();
            String output = "7\n3";
            int N = 2;
            String[] queries = new String[]{
                    "1 0 5",
                    "1 1 7",
                    "1 0 3",
                    "2 1 0",
                    "2 1 1"
            };
            assertThat(dynamicArray.perform(N, queries), is(output));
        });
    });
}}
