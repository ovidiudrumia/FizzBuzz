package com.axp.testsamples.unit;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class FizzBuzzNumberTest {
    @Test
    public void toString_givenNumber_returnStringNumber() {
        FizzBuzzNumber fizzBuzzNumber = new FizzBuzzNumber();

        assertThat(fizzBuzzNumber.toString(2)).isEqualTo("2");
    }

}
