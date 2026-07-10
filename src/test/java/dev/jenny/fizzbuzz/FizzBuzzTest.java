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

    @Test
    void testConvertReturnsBuzzWhenDivisibleByFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(5);
        assertEquals("Buzz", result);
    }

    @Test
    void testConvertReturnsFizzBuzzWhenDivisibleByThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(15);
        assertEquals("FizzBuzz", result);
    }
}