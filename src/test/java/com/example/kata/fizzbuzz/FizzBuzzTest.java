package com.example.kata.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    public FizzBuzzTest() {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    void whenNumberNotMultipleOfThreeReturnTheNumber(){
        assertEquals("1", fizzBuzz.validateNumberFizzBuzz(1));
    }

    @Test
    void whenNumberMultiplesOfThreeReturnFizz(){
        assertEquals("Fizz",fizzBuzz.validateNumberFizzBuzz(3));
    }

    @Test
    void whenNumberMultiplesOfFiveReturnBuzz(){
        assertEquals("Buzz",fizzBuzz.validateNumberFizzBuzz(5));
    }

    @Test
    void whenNumberMultipleOfThreeAndFive(){
        assertEquals("FizzBuzz",fizzBuzz.validateNumberFizzBuzz(15));
    }

}
