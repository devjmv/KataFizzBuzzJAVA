package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzStage1() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("1", FizzBuzz.fizzBuzz(1));
    }

    @Test
    public void testFizzBuzzStage2() {
        assertEquals("Fizz", FizzBuzz.fizzBuzzIncludeNumber(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzzIncludeNumber(31));
        assertEquals("Buzz", FizzBuzz.fizzBuzzIncludeNumber(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzzIncludeNumber(52));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzzIncludeNumber(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzzIncludeNumber(30));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzzIncludeNumber(53));
        assertEquals("1", FizzBuzz.fizzBuzzIncludeNumber(1));
    }

}
