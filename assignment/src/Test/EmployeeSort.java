//
//Create a class employee to store empid, ename,salary, create a array of employee 
//objects of size 20; add 15 employee objects in it. And sort it based on salary using 
//bubble sort,  
//So 5 locations are free,  
//Accept 5 more elements from user and add these elements in the array, by using 
//insertion sort.

package Test;
import beans.Employee;
import java.util.Scanner;

public class EmployeeSort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee[] employees=new Employee[5];
        System.out.println("Enter employees data(empid,ename,salary)");
		for(int i=0;i<2;i++) {
			int id=sc.nextInt();
			String name=sc.next();
			double sal=sc.nextDouble();
			
			employees[i]=new Employee(id,name,sal);
			
		}
		bubbleSort(employees,2);
		System.out.println("Employees after sorting");
		for(int i=0;i<2;i++) {
			System.out.println(employees[i]);
		}
		System.out.println("enter 3 more employees data(empid,name,salary");
		for(int j=0;j<3;j++) {
			int id=sc.nextInt();
			String name=sc.next();
			double sal=sc.nextDouble();
			
			employees[j+2]=new Employee(id,name,sal);
			
		}
		insertionSort(employees,5);
	
		System.out.println("final Employees after sorting");
		for(int i=0;i<5;i++) {
			  if (employees[i] != null) {
	                System.out.println(employees[i]);
	            }
		}
	}

	private static void insertionSort(Employee[] arr, int n) {
		for(int i=1;i<n;i++) {
			int j=i-1;
				Employee key=arr[i];
				while(j>=0 && arr[j].getSalary()>key.getSalary()) {
					arr[j+1]=arr[j];
					j--;
				
			}
				arr[j+1]=key;
		}
		
	}

	private static void bubbleSort(Employee[] arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				if(arr[j-1].getSalary()>arr[j].getSalary()) {
					Employee temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}
}