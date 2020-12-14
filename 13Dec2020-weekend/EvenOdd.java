package com.ss.homework;

/*This assignment accepts a list of numbers and prepends "even" or "odd: depending on the number*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class EvenOdd
{
    public static void main(String[] args)
    {
        List<Integer> numList = Arrays.asList(1, 14, 33, 46, 57);
        System.out.println(check(numList));
    }

    private static String check(List<Integer> prepender)
    {
        StringBuilder myString = new StringBuilder();

        prepender.forEach((number)->{
            myString.append((number %2 == 0 ? "even " : "odd " ) + number + ",");
        });        

        myString.deleteCharAt(myString.length()-1);
        return myString.toString();
    }
}
