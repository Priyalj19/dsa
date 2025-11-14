package assignment;

import java.util.Scanner;

class Employee {
    int empid;
    String ename;
    double salary;

    Employee(int empid, String ename, double salary) {
        this.empid = empid;
        this.ename = ename;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empid + " " + ename + " " + salary;
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create array of size 20
        Employee[] employees = new Employee[5];

        // Step 2: Add 15 employees
        System.out.println("Enter details of 15 employees (empid, ename, salary):");
        for (int i = 0; i < 2; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double sal = sc.nextDouble();
            employees[i] = new Employee(id, name, sal);
        }

        // Step 3: Sort first 15 employees using Bubble Sort
        bubbleSort(employees, 2);

        System.out.println("\nEmployees after Bubble Sort:");
        for (int i = 0; i < 2; i++) {
            System.out.println(employees[i]);
        }

        // Step 4: Accept 5 more employees
        System.out.println("\nEnter details of 3 more employees (empid, ename, salary):");
        for (int i = 0; i < 3; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double sal = sc.nextDouble();
            employees[2 + i] = new Employee(id, name, sal);

            // Insert new employee into sorted portion using insertion sort logic
            insertionSort(employees, 2 + i + 1);
        }

        System.out.println("\nFinal Sorted Employees:");
        for (int i = 0; i < 5; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }

        sc.close();
    }

    // Bubble Sort based on salary
    public static void bubbleSort(Employee[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j-1].salary > arr[j].salary) {
                    Employee temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Insertion Sort for newly added employee
    public static void insertionSort(Employee[] arr, int n) {
        for (int i = 1; i < n; i++) {
            Employee key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].salary > key.salary) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
