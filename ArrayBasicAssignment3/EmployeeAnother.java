package ArrayBasicAssignment3;

public class EmployeeAnother {
	Employee obj2=new Employee();
	
	void printArray(Employee[]arr)
	{
		System.out.println("................................................");
		System.out.println("Inside EmployeeAnother class ");
		for (Employee emp : arr) {
			
			System.out.println(emp.toString());
		}
		
	}


}
