
public class Program {

    public static void main(String[] args) {

        System.out.println("Enter array size:");
        int size = ConsoleInput.getInt();
        
        int[] arr = new int[size];
       
      
        System.out.println("Enter array elements:");

        for (int iTemp = 0; iTemp < arr.length; iTemp++) { 
            arr[iTemp] = ConsoleInput.getInt();
        }

        ArrayOperation operation = new ArrayOperation();
        
        
// 2. Write a Java program to sort an numeric array. The size of the array will be taken from the user, after he specifies the size all the elements of the array will be taken as input and the arryay will be sorted.
        operation.ArrSort(arr);

        System.out.println("Sorted array:");

        for (int iTemp = 0; iTemp < arr.length; iTemp++) {
            System.out.print(arr[iTemp] + " ");
        }
        
        
        
// 3. Modify the exercise 2 and Write a Java program to sum values of an array
        System.out.println("\n\nSum values of array: " + operation.SumArr(arr));
        
// 4. Modify exercise 2 Write a Java program to calculate average value of an array elements       
        System.out.println("\nAverage value of array: " + operation.AvgArr(arr));
        
// 5. .Modify exercise 2 Write a Java program to copy an array by itera ng the array 
        System.out.println("Copy of array:");
        
        int[] copyArray = new int[arr.length];
        operation.EmptyArray(arr, copyArray);

        for (int iTemp = 0; iTemp < arr.length; iTemp++) {
            System.out.print(copyArray[iTemp] + " ");
        }
        
        
 // 6.Modify exercise 2 Write a Java program to find the maximum and minimum value of an array.
    System.out.println("\n\nMaximum value of array: " + operation.Max(arr));
    System.out.println("Minimum value of array: " + operation.Min(arr));
    
 // 7.Modify exercise 2 Write a Java program to reverse an array of integer values
    System.out.println("\nReverse of array: ");
    operation.Reverse(arr);
    
    
 // 8. Modify exercise 2 Write a Java program to find the duplicate values of an array of integer values
    System.out.println();
    operation.Duplicate(arr);
    

    
  // 10. Modify exercise 2 to accept 2 different values in 2 different arrays and  find the common elements between two arrays.
    System.out.println("\n============ Find Common Elements ============");
    
    int[] arr1 = new int[size];
    int[] arr2 = new int[size];
    int[] arrBlank = new int[size];
    
    System.out.println("\nEnter Elements in First Array: ");
    for(int iTemp = 0; iTemp < size; iTemp++) {
    	arr1[iTemp] = ConsoleInput.getInt();
    }
    
    System.out.println("\nEnter Elements in Second Array: ");
    for(int iTemp = 0; iTemp < size; iTemp++) {
    	arr2[iTemp] = ConsoleInput.getInt();
    }
    
    int indexReturn = operation.FindCommon(arr1, arr2, arrBlank);
    
	System.out.println("\nCommon elements in both arrays are: ");
	for(int iTemp = 0; iTemp < indexReturn; iTemp++) {
    	System.out.print(arrBlank[iTemp] + " ");
	}
    
    }
}
