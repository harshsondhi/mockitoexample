package hello.services;

import java.util.List;

import hello.dao.Employee;

public interface EmployeeService {
	 void saveEmployee(Employee employee);
	 
	    List<Employee> findAllEmployees();
	 
	    void deleteEmployeeBySsn(String ssn);
	    
	    //void someTime(String variable);
	    
	    public List<Employee> someTime(String ssn);
}
