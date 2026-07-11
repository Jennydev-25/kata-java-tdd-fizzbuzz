package dev.jenny.fizzbuzz;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int number = 1; number <= 100; number++) {
            System.out.println(fizzBuzz.convert(number));
        }
    }
}