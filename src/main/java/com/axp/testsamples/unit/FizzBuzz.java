package com.axp.testsamples.unit;

//The FizzBuzz class is very simple
//It's purpose is to:
// 1. return number if that number is not divided by 3 or 5
// 2. return 'Fizz' if divided by 3
// 3. return 'Buzz' if divided by 5
// 4. return 'FizzBuzz' if divided by 15

public class FizzBuzz {
    public static final int FIFTEEN = 15;
    public static final int FIVE = 5;
    public static final int THREE = 3;
    private FizzBuzzNumber fizzBuzzNumber = new FizzBuzzNumber();

    public String fizzBuzz(int number) {
        if(isMultipleOf(number, FIFTEEN)){
            return "FizzBuzz";
        }
        if(isMultipleOf(number, FIVE)) {
            return "Buzz";
        }
        if(isMultipleOf(number, THREE)) {
            return "Fizz";
        }
        return fizzBuzzNumber.toString(number);
    }

    private boolean isMultipleOf(int number, int i) {
        return number % i == 0;
    }

    public void setFizzBuzzNumber(FizzBuzzNumber fizzBuzzNumber) {
        this.fizzBuzzNumber = fizzBuzzNumber;
    }
}
