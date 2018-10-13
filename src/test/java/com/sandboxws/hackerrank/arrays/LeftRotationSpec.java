package com.sandboxws.hackerrank.arrays;

import com.sandboxws.hackerrank.com.sandboxws.hackerrank.arrays.LeftRotation;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static j8spec.J8Spec.describe;
import static j8spec.J8Spec.it;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(J8SpecRunner.class)
public class LeftRotationSpec {{
    describe("Left Rotation", () -> {
        it("should print 5 1 2 3 4", () -> {
            String output = "5 1 2 3 4";
            LeftRotation leftRotation = new LeftRotation();
            int rotations = 4;
            String[] numbers = new String[]{"1", "2", "3", "4", "5"};
            assertThat(leftRotation.perform(rotations, numbers), is(output));
        });
    });
}}
