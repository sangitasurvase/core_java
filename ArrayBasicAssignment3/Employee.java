package ArrayBasicAssignment3;

public class Employee {
	//1] Write a program to Add Employee Class Object in Array, return it and print it.

	int empId;// Variable Declaration
	String empName;
	Float Salary;
	String empDept;
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int empId)
	{
		if(empId>0)
		{
			this.empId = empId;

		}
		else
		{
			System.out.println("Incorrect Input");
		}
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Float getSalary() {
		return Salary;
	}
	public void setSalary(Float salary) {
		this.Salary = salary;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Salary=" + Salary + ", empDept=" + empDept
				+ "]";
	}
	
	
}
