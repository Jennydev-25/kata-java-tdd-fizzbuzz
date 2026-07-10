package dev.jenny.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    void testConvertReturnsFizzWhenDivisibleByThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(3);
        assertEquals("Fizz", result);
    }
}