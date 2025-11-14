                                                                                                   
//Create an array size 10 of integers, add 8 values in it , sort the numbers, after sorting        
//accept 2 more numbers from user one by one and add it in the array, using insertion              
//sort.                                                                                            
package Test;                                                                                      
                                                                                                   
import java.util.Scanner;                                                                          
                                                                                                   
import service.InsertionSort;                                                                      
                                                                                                   
public class Que4 {                                                                                
    public static void main(String[] args) {                                                       
    	Scanner sc=new Scanner(System.in);                                                         
    	int arr[]=new int[10];                                                                     
    	int n=0;                                                                                   
    	for(int i=0;i<8;i++) {                                                                     
    		arr[i]=sc.nextInt();                                                                   
    	    n++;                                                                                   
    	}                                                                                          
    	InsertionSort.insertionSort(arr,n);                                                        
    	displaySort(arr,n);                                                                        
    	System.out.println("enter 2 more numbers");                                                
        for(int i=0;i<2;i++) {                                                                     
           arr[n]=sc.nextInt();                                                                  
           n++;                                                                                    
        }                       
        
        InsertionSort.insertionSort(arr, n);                                                       
        displaySort(arr,n);                                                                        
                                                                                                   
    }                                                                                              
                                                                                                   
	private static void displaySort(int arr[],int n) {                                             
		for(int i=0;i<arr.length;i++) {                                                            
			System.out.println(arr[i]);                                                            
		}                                                                                          
		                                                                                           
	}                                                                                              
                                                                                                   
	                                                                                               
}                                                                                                  
                                                                                                   
                                                                                                   
                                                                                                   