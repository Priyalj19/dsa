// Create an array of employees, sort it by using heap sort and  quick sort

package Test;
import beans.Employee;
import java.util.Scanner;

public class Que3 {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Employee[] emp=new Employee[5];
     System.out.println("enter details of employee(id,name,sal)");
     for(int i=0;i<emp.length;i++) {
    	 int id=sc.nextInt();
    	 String name=sc.next();
    	 double sal=sc.nextInt();
    	 emp[i]=new Employee(id,name,sal);
     }
//     
     System.out.println("employees after heap sort");
     heapSort(emp);
     display(emp);
//     System.out.println("employees after quick sort");
//     quickSort(emp,0,emp.length-1);
//     display(emp);
 }

private static void quickSort(Employee[] emp,int start,int end) {
	if(start<end) {
		int p=partition(emp,start,end);
		quickSort(emp, start, p-1);
		quickSort(emp, p+1, end);
		
	}
	
}

private static int partition(Employee[] emp, int start, int end) {
    int i=start;
    int j=end;
    int pivot=start;
    while(i<j ) {
    	while(i<end && emp[i].getSalary()<=emp[pivot].getSalary()) {
    		i++;
    	}
    	while(j>start && emp[j].getSalary()>emp[pivot].getSalary()) {
    		j--;
    	}
    	if(i<j) {
    	 Employee temp=emp[i];
    	 emp[i]=emp[j];
    	 emp[j]=temp;
    	 
    	}
    	
    }
    if(pivot!=j) {
		Employee temp=emp[j];
		emp[j]=emp[pivot];
		emp[pivot]=temp;
	}

//    System.out.println("Pivot position : " + j + 
//                       " Pivot salary : " + emp[j].getSalary());
	return j;
}

private static void display(Employee[] emp) {
	for(Employee e:emp) {
		System.out.println(e);
	}
	
}

private static void heapSort(Employee[] arr) {
	for(int i=(arr.length/2)-1;i>=0;i--) {
		heapify(arr,arr.length,i);
	}
	int n=arr.length;
	for(int i=n-1;i>=0;i--) {
		Employee temp=arr[0];
		arr[0]=arr[i];
		arr[i]=temp;
		heapify(arr,i,0);		
	}
	
	
}

private static void heapify(Employee[] arr, int n, int i) {
	int left=2*i+1;
	int right=2*i+2;
	int largest=i;
	if(left<n && arr[left].getSalary()>arr[largest].getSalary()) {
		largest=left;
	}
	if(right<n && arr[right].getSalary()>arr[largest].getSalary()) {
		largest=right;
	}
	if(largest!=i) {
		Employee temp=arr[i];
		arr[i]=arr[largest];
		arr[largest]=temp;
		
		heapify(arr,n,largest);
	}

	
}
 
 
}