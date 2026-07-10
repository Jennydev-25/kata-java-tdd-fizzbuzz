package dev.jenny.fizzbuzz;

public class FizzBuzz {

    public String convert(int number) {
        String result = "";
        if (isFizz(number)) {
            result += "Fizz";
        }
        if (isBuzz(number)) {
            result += "Buzz";
        }
        if (result.isEmpty()) {
            return String.valueOf(number);
        }
        return result;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0 || String.valueOf(number).contains("3");
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0 || String.valueOf(number).contains("5");
    }
}