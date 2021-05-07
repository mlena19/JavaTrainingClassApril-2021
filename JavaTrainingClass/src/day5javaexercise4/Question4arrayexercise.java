package day5javaexercise4;

public class Question4arrayexercise {

	public static void main(String[] args) {
		// Write a Java program to copy an array by iterating the array. 
		/*Arr1 [3, 4,5,2] 
				Arr2[null, null, null, null]*/ 

	      //Initialize array     
        int [] arr1 = new int [] {2, 3, 4, 5};     
         //Create another array arr2 with size of arr1    
        int arr2[] = new int [arr1.length];    
        //Copying all elements of one array into another    
        for (int i = 0; i < arr1.length; i++) {     
            arr2[i] = arr1[i];     
        }      
         //Displaying elements of array arr1     
        System.out.println("Elements of Nigstiye array, which zinebere: ");    
        for (int i = 0; i < arr1.length; i++) {     
           System.out.print(arr1[i] + " ");    
        }     
            
        System.out.println();    
            
        //Displaying elements of array arr2     
        System.out.println("Elements of hadish ekub, which is nay Ziyada: ");    
        for (int i = 0; i < arr2.length; i++) {     
           System.out.print(arr2[i] + " ");    
        }     
    }    
}    
	
