package dev.jenny.fizzbuzz;

public class FizzBuzz {

    public String convert(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        }
        return "Fizz";
    }
}