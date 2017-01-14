package com.sandboxws.hackerrank.arrays;

import com.sandboxws.hackerrank.com.sandboxws.hackerrank.arrays.ArraysDS;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static j8spec.J8Spec.describe;
import static j8spec.J8Spec.it;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(J8SpecRunner.class)
public class ArraysDSSpec {{
    describe("Arrays-DS", () -> {
        it("should print the array in reverse", () -> {
            int n = 4;
            String[] array = new String[]{"1", "4", "3", "2"};
            String output = "2 3 4 1";

            ArraysDS arraysDS = new ArraysDS();
            assertThat(arraysDS.perform(n, array), is(output));
        });
    });
}}
