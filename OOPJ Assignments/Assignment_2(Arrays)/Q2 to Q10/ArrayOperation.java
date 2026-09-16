public class ArrayOperation {

    public void ArrSort(int[] arr) {

        for (int iTemp = 0; iTemp < arr.length - 1; iTemp++) {

            for (int jTemp = 0; jTemp < arr.length - 1 - iTemp; jTemp++) {

                if (arr[jTemp] > arr[jTemp + 1]) {

                    int temp = arr[jTemp];
                    arr[jTemp] = arr[jTemp + 1];
                    arr[jTemp + 1] = temp;
                }
            }
        }
    }
     
// 3. Modify the exercise 2 and Write a Java program to sum values of an array
    public int SumArr(int[] arr) {
    	int sum = 0;
    	
    	for (int iTemp = 0; iTemp < arr.length; iTemp++) {
    		sum = sum + arr[iTemp];
    	}
    	
    	return sum;
    }
    
// 4. Modify exercise 2 Write a Java program to calculate average value of an array elements
    public int AvgArr(int[] arr) {
    	return SumArr(arr)/arr.length;
    }
    
// 5. Modify exercise 2 Write a Java program to copy an array by itera ng the array   
    public void EmptyArray(int[] arr, int[] copyArray) {
    	
    	for(int iTemp = 0; iTemp < arr.length; iTemp++) {
    		copyArray[iTemp] = arr[iTemp];
    	}
    }
    
// 6.Modify exercise 2 Write a Java program to find the maximum and minimum value of an array.
    public int Max(int[] arr) {
    	int max = arr[0];
    	
    	for (int iTemp = 0; iTemp < arr.length; iTemp++) {
    		if(arr[iTemp] > max) {
    			max = arr[iTemp];
    		}   			
    	}
    	return max;
    }

// Find Minimum
    public int Min(int[] arr) {
    	int min = arr[0];
    	
    	for (int iTemp = 0; iTemp < arr.length; iTemp++) {
    		if(arr[iTemp] < min) {
    			min = arr[iTemp];
    		} 
    	}
    	return min;
    }

// 7.Modify exercise 2 Write a Java program to reverse an array of integer values
    public void Reverse(int[] arr) {
    	for (int iTemp = arr.length - 1; iTemp >= 0 ; iTemp--) {
    	    System.out.print(arr[iTemp] + " ");
    	}
    }
 
// 8.Modify exercise 2 Write a Java program to find the duplicate values of an array of integer values
    public void Duplicate(int[] arr) {
    		
    	for(int iTemp = 0; iTemp < arr.length; iTemp++) {
    		
    		for (int jTemp = iTemp + 1; jTemp < arr.length; jTemp++) {
    		    
    			if(arr[iTemp] == arr[jTemp]) {
    			    
    				System.out.println("Duplicate value: " + arr[iTemp]);
    			    break;
    		    }
    	    }
    	}

    }
    
 // 10. Accept 2 different values in 2 different arrays and  find the common elements between two arrays.
    public int FindCommon(int[] arr1, int[] arr2, int[] arrBlank) {
    	
    	int index = 0;
    	for(int iTemp = 0; iTemp < arr1.length; iTemp++) { 
  
    		for(int jTemp = 0; jTemp < arr2.length; jTemp++) {
    			
    			if(arr2[jTemp] == arr1[iTemp]){	
            		arrBlank[index] = arr2[jTemp];
            		index++;	
            	}    			
    		}    	
        }
    	
    	return index;
    	
    }
}
