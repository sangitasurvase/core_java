package ArrayBasicAssignment3;

public class EmployeeArray {

	public static void main(String[] args)
	{
		EmployeeArray ob=new EmployeeArray();
			Employee[] empob=ob.EmpInArray();
			ob.printEmployee(empob);	
			EmployeeAnother empno=new EmployeeAnother();
			empno.printArray(empob);
	}
	Employee[] EmpInArray()
	{
		
		Employee obj=new Employee();
		obj.setEmpId(101);
		obj.setEmpName("Sangita");
	
		obj.setEmpDept(" Marketing");	
		obj.setSalary(23000.50f);
		Employee obj2=new Employee();
		obj2.setEmpId(102);
		obj2.setEmpName("Pratiksha");
		obj2.setSalary(50000.50f);
		obj2.setEmpDept("Production");
		
		Employee obj3=new Employee();
		obj3.setEmpId(103);
		obj3.setEmpName("sita");
		obj3.setSalary(30000.70f);
		obj3.setEmpDept("Finance");
		Employee obj4=new Employee();
		obj4.setEmpId(104);
		obj4.setEmpName("radha");
		obj4.setSalary(32000.50f);
		obj4.setEmpDept("Marketing");
      Employee arr[]=new  Employee[4];
      arr[0]=obj;
      arr[1]=obj2;
      arr[2]=obj3;
      arr[3]=obj4;

		return arr;
	}
	void printEmployee(Employee[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			//Employee p=arr[i];
			System.out.println("Employee Record In Emplyee Class"+arr[i]);
		}
	}
}
