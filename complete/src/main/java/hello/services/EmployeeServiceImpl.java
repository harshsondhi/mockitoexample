package hello.services;

import java.util.List;

import hello.dao.Employee;
import hello.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao;
	private SomeClass sc = new SomeClass("111");
    
    public EmployeeServiceImpl(EmployeeDao dao){
        this.dao = dao;
    }
      
    public void saveEmployee(Employee employee) {
        dao.saveEmployee(employee);
    }
  
    public List<Employee> findAllEmployees() {
        return dao.findAllEmployees();
    }
  
    public void deleteEmployeeBySsn(String ssn) {
        dao.deleteEmployeeBySsn(ssn);
    }

    public List<Employee> someTime(String ssn){
    	sc.access(ssn);
    	return dao.findAllEmployees();
    }

	
	
}
