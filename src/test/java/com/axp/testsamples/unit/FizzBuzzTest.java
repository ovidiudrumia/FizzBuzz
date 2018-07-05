package com.axp.testsamples.unit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzTest {
    @Test
    public void fizzBuzz_givenNumberMultipleOf3_returnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String fizzBuzzResult = fizzBuzz.fizzBuzz(3);

        assertThat(fizzBuzzResult).isEqualTo("Fizz");
    }

    @Test
    public void fizzBuzz_givenNumberMultipleOf5_returnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String fizzBuzzResult = fizzBuzz.fizzBuzz(5);

        assertThat(fizzBuzzResult).isEqualTo("Buzz");
    }

    @Test
    public void fizzBuzz_givenNumberMultipleOf15_returnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String fizzBuzzResult = fizzBuzz.fizzBuzz(15);

        assertThat(fizzBuzzResult).isEqualTo("FizzBuzz");
    }

    @Test
    public void fizzBuzz_givenNumberNotMultipleOf3Or5_fizzBuzzCallsFizzNumberToString() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        FizzBuzzNumber fizzBuzzNumber = Mockito.mock(FizzBuzzNumber.class);
        fizzBuzz.setFizzBuzzNumber(fizzBuzzNumber);

        String fizzBuzzResult = fizzBuzz.fizzBuzz(2);

        verify(fizzBuzzNumber).toString(2);
    }
}
