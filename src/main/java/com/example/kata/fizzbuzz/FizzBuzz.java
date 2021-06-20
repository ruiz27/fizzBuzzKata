package com.example.kata.fizzbuzz;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzz {

    public String validateNumberFizzBuzz(int number){

        if(number%3==0 && number%5==0){
            return "FizzBuzz";
        }

        if(number%3==0){
            return "Fizz";
        }
        if(number%5==0){
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
