package dayTwoHomework;


public class TwoDimensionalArray {
	
	

	public static void main(String[] args) {
		int [][] myArray = { {20, 10, 3},
							 {8, 9, 10},
							 {7, 76, 47}
		};
		int[] ArrayResult = getMaxValue(myArray);
		System.out.println(ArrayResult[0] + " is the largest number. It is located at " + ArrayResult[1] + ", " + ArrayResult[2] );
		
	}
    public static int[] getMaxValue(int[][] numbers) {
    	int iIndex = -1;
    	int jIndex = -1;
    	int[] myIntArray = new int[3];
        int maxValue = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > maxValue) {
                    maxValue = numbers[i][j];
                    iIndex = i;
                    jIndex = j;
                }
            }
            
        }
        myIntArray[0] = maxValue;
        myIntArray[1] = iIndex;
        myIntArray[2] = jIndex;
        return myIntArray;
    }
    
    
    

}
