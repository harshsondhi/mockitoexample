package hello.dao;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

	 public void saveEmployee(Employee employee) {
	        List<Employee> employees = getEmployeeList();
	        for (Employee e : employees) {
	            if (e.getName().equals(employee.getName())) {
	                throw new RuntimeException("Employee already exist");
	            }
	        }
	        System.out.print("Saving Employee..... saved employee");
	    }
	 
	    public List<Employee> findAllEmployees() {
	        return getEmployeeList();
	    }
	 
	    public void deleteEmployeeBySsn(String ssn) {
	        boolean found = false;
	        List<Employee> employees = getEmployeeList();
	        for (Employee e : employees) {
	            if (e.getSsn().equals(ssn)) {
	                found = true;
	                System.out.print("Deleting employee by SSN..... deleted");
	                return;
	            }
	        }
	 
	        if (!found) {
	            throw new RuntimeException("Employee not found with this SSN");
	        }
	 
	    }
	 
	    public List<Employee> getEmployeeList() {
	        List<Employee> employees = new ArrayList<Employee>();
	        Employee e1 = new Employee();
	        e1.setId(1);
	        e1.setName("Axel");
	 
	        Employee e2 = new Employee();
	        e1.setId(2);
	        e2.setName("Jeremy");
	 
	        employees.add(e1);
	        employees.add(e2);
	        return employees;
	    }

}
