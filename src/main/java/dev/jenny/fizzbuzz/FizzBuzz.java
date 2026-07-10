package dev.jenny.fizzbuzz;

public class FizzBuzz {

    public String convert(int number) {
        if (isFizz(number) && isBuzz(number)) {
            return "FizzBuzz";
        }
        if (isBuzz(number)) {
            return "Buzz";
        }
        if (isFizz(number)) {
            return "Fizz";
        }
        return String.valueOf(number);
    }

    private boolean isFizz(int number) {
        return number % 3 == 0 || String.valueOf(number).contains("3");
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0 || String.valueOf(number).contains("5");
    }
}