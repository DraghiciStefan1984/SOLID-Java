package solid.singleresponsibility;

import java.sql.SQLException;

public class EmployeeDAO 
{
	public void saveEmployee(Employee employee) throws SQLException
	{
		System.out.println(employee.getName()+" saved.");
	}
	
	public void removeEmployee(Employee employee)
	{
		System.out.println(employee.getName()+" deleted.");
	}
}
