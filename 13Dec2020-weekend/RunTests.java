package com.ss.homework;

/*This assignments runs tests to check for odd, even, and prime numbers. It also
 * checks if numbers are palindromic.*/

import java.math.BigInteger;
import java.util.ArrayList;


interface CheckPrimePalindrome
{
    public String perform(int n);
}
        
public class RunTests
{
    public static void main(String[] args)
    {
    	CheckPrimePalindrome oddTest = isOdd();
    	CheckPrimePalindrome primeTest = isPrime();
    	CheckPrimePalindrome palindromeTest = isPalindrome();
        
        int data[] = {3, 4, 43, 747, 5, 66};
        for (int num : data)
        {
            System.out.println("The number being tested is " + num);
            System.out.println(oddTest.perform(num));  
            System.out.println(primeTest.perform(num));  
            System.out.println(palindromeTest.perform(num));
            System.out.println("---------------");
        }
    }

    private static CheckPrimePalindrome isOdd()
    {
        return number -> ( (number % 2 != 0) ? number + " is odd" : number + " is even" );
    }

    private static CheckPrimePalindrome isPrime()
    {
        return number -> ( (BigInteger.valueOf(number).isProbablePrime(1000000)) ? "prime" : "composite" );
    }

    private static CheckPrimePalindrome isPalindrome()
    {
        return number ->
        {
            if (number == 0) return "palindrome";
            
            ArrayList<Integer> numberList = new ArrayList<>();
            while (number > 0)
            {
                numberList.add(number % 10);
                number = number / 10;
            }
            
            int i = 0, j = numberList.size() - 1;
            while (i < j)
            {
                if (numberList.get(i++) != numberList.get(j--))
                    return "not a palindrome";
            }
            
            return "palindrome";
        };
    }

}
