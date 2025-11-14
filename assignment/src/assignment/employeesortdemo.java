// Create an array of employees, sort it by using heap sort and  quick sort


public class EmployeeSortDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create array of Employees
        Employee[] employees = new Employee[5];
        System.out.println("Enter 5 employees data (id, name, salary):");
        for (int i = 0; i < employees.length; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double salary = sc.nextDouble();
            employees[i] = new Employee(id, name, salary);
        }

        // Step 2: Sort using Heap Sort
        System.out.println("\nEmployees sorted by salary using Heap Sort:");
        heapSort(employees);
        printArray(employees);

        // Step 3: Sort using Quick Sort
        System.out.println("\nEmployees sorted by salary using Quick Sort:");
        quickSort(employees, 0, employees.length - 1);
        printArray(employees);

        sc.close();
    }

    // ---------------- Heap Sort ----------------
    private static void heapSort(Employee[] arr) {
        int n = arr.length;

        // Build heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            Employee temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private static void heapify(Employee[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left].getSalary() > arr[largest].getSalary())
            largest = left;

        if (right < n && arr[right].getSalary() > arr[largest].getSalary())
            largest = right;

        if (largest != i) {
            Employee swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    // ---------------- Quick Sort ----------------
  private static void quickSort(Employee[] arr, int start, int end) {
    if (start < end) {
        int p = partition(arr, start, end);
        quickSort(arr, start, p - 1);
        quickSort(arr, p + 1, end);
    }
}

    private static int partition(Employee[] arr, int start, int end) {
    int pivot = start;   // pivot index
    int i = start;
    int j = end;

    while (i < j) {
        // move i forward until salary > pivot salary
        while (i < end && arr[i].getSalary() <= arr[pivot].getSalary()) {
            i++;
        }
        // move j backward until salary <= pivot salary
        while (j > start && arr[j].getSalary() > arr[pivot].getSalary()) {
            j--;
        }
        // swap if i and j haven't crossed
        if (i < j) {
            Employee temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // finally swap pivot with arr[j]
    if (pivot != j) {
        Employee temp = arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;
    }

    System.out.println("Pivot position : " + j + 
                       " Pivot salary : " + arr[j].getSalary());

    return j;
}

    // ---------------- Utility ----------------
    private static void printArray(Employee[] arr) {
        for (Employee e : arr) {
            System.out.println(e);
        }
    }
}

