package com.ss.basics.homework;

/* This is the homework assignment for Day 1 of Smoothstack training. We must replicate triangular patterns.
 * 
 *  
 *  @author DanielGibbons
 *  */

public class homework {
	
	public static void RightTriangle() {
		System.out.println("1.)");
		 int rows = 4;

		    for (int i = 1; i <= rows; i++) {
		      for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
		    System.out.println("- - - - -");

		    System.out.println();
        } 

		
	public static void InvertedTriangle() {
		System.out.println("2.)");
	    int rows = 4;

	    for (int i = rows; i >= 1; i--) {
	      for (int j = 1; j <= i; j++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    System.out.println("- - - - -");
	    System.out.println();
	}
	
	public static void ChristmasTree() {
		System.out.println("3.)");
		
		/* Conceptualizing the design
		 *    *    i = 0, numSpaces = 4, lights = 1
		 * 	 ***   i = 1, numSpaces = 3, lights = 3
		 *  *****  i = 2, numSpaces = 2, lights = 5
		 * ******* i = 3, numSpaces = 1, lights = 7 
		 * 
		 *  */
		
		for (int i = 0; i < 4; i++) {
			int numSpaces = 4 - i;
			int lights = 2*i + 1;
			for (int j = 0; j < numSpaces; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < lights; j++) {
					System.out.print("*");
				}
			for (int j = 0; j < numSpaces; j++) {
					System.out.print(" ");
				}
				System.out.println();
		}
		System.out.println("- - - - - - ");
		  System.out.println();
	}
	
	public static void InvertedChristmasTree() {
	System.out.println("4.)");
		
		/* Conceptualizing the design
		 *  ******* i=0, numSpaces = 1, lights = 7
		 *   *****  i=1, numSpaces = 2, lights = 5
		 *    ***   i=2, numSpaces = 3, lights = 3
		 *     *    i=3, numSpaces = 4, lights = 1
		 *  
		 *  */
		
		for (int i = 0; i < 4; i++) {
			int numSpaces = 1 + i;
			int lights = 7 -2*i;
			for (int j = 0; j < numSpaces; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < lights; j++) {
					System.out.print("*");
				}
			for (int j = 0; j < numSpaces; j++) {
					System.out.print(" ");
				}
				System.out.println();
		}
		System.out.println("- - - - - - ");
		  System.out.println();
		  }
	

	public static void main(String[] args) {
		RightTriangle();
		InvertedTriangle();
        ChristmasTree();
        InvertedChristmasTree();
        
	}
	}


