package hello.dao;
import java.util.List;

public interface EmployeeDao {
	void saveEmployee(Employee employee);

	List<Employee> findAllEmployees();

	void deleteEmployeeBySsn(String ssn);
}
