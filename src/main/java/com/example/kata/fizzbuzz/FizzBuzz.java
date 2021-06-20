package com.example.kata.fizzbuzz;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzz {

    public String validateNumberFizzBuzz(int number){
        String result = "";

        if(number%3==0){
            result+= "Fizz";
        }
        if(number%5==0){
            result += "Buzz";
        }

        return result.isEmpty() ? String.valueOf(number) : result;
    }
}
