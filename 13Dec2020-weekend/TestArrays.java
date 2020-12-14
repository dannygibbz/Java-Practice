package com.ss.homework;

/*This assignment is to filter strings in an array such that only strings beginning with 
 * lowercase 'a' and containing maximum 3 letters are returned.*/

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestArrays
{
    public static void main(String[] args)
    {
        String[] words = { "and", "the", "add", "assignment", "automobile", "aid"};
        List<String> stringReview = new ArrayList<>(Arrays.asList(words));
        
        System.out.println("The words beginning with 'a' and containing max 3 letters are " + check(stringReview));
    }

    private static List<String> check(List<String> test)
    {
        List<String> targetedWords = new ArrayList<>();
        test.stream().filter(s-> (s.length() == 3 && s.charAt(0) == 'a')).collect(Collectors.toCollection(() -> targetedWords));;
        return targetedWords;
    }
}