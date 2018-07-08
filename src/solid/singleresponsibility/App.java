package solid.singleresponsibility;

import java.sql.SQLException;

public class App 
{
	public static void main(String[] args) throws SQLException
	{
		Employee peggy = new Employee(1, "peggy","accounting", true);
		App.hireNewEmployee(peggy);
        printEmployeeReport(peggy, FormatType.CSV);
	}
	
	public static void hireNewEmployee(Employee employee) throws SQLException
	{
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.saveEmployee(employee);     
    }
     
    public static void terminateEmployee(Employee employee)
    {
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.removeEmployee(employee);
    }
     
    public static void printEmployeeReport(Employee employee, FormatType formatType)
    {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
         
    }
}
