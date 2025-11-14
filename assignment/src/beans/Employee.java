
package beans;

public class Employee {
    int empid;
    String ename;
    private double salary;
	public Employee(int empid, String ename, double salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.setSalary(salary);
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + getSalary() + "]";
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
    
}
