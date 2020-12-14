package com.ss.homework;

/*This assignment utilizes sorting methods for length, alphabetical order, and 
 * strings beginning with the letter 'E'*/

import java.util.Arrays;


public class ArrangeStrings
{
 public static void main(String[] args)
 {
//	 lay out what words will be in the array
     String[] mood = { "happy", "energetic", "exhausted", "glum", "funny", "weird", "charitable"};
     
//     sort by length
     Arrays.sort(mood, (string1, string2)->Integer.compare(string1.length(), string2.length()));
     System.out.println("Shortest length to longest length words: " + Arrays.toString(mood));
     
//     	sort by length (reverse -- longest words first)
     Arrays.sort(mood, (string1, string2)->Integer.compare(string2.length(), string1.length()));
     System.out.println("Longest length to shortest length: " + Arrays.toString(mood));

//        alphabetical sort
     Arrays.sort(mood, (string1, string2)->Integer.compare(string1.charAt(0), string2.charAt(0)));
     System.out.println("Aplhabetical (based on first character): " +Arrays.toString(mood));
     
     
//   sort based on the first character (in this case, 'E')
     Arrays.sort(mood, (string1, string2)->
     {
         boolean test1 = string1.charAt(0) == 'e';
         boolean test2 = string2.charAt(0) == 'e';
         
         if (test1 && !test2) return -1;
         if (test2 && !test1) return 1;
         return 0;            
     });
     System.out.println("Letters beginning with 'E': " + Arrays.toString(mood));
 }
}