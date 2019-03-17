package hello.services;


import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.testng.Assert;
import org.junit.BeforeClass;


import hello.dao.Employee;
import hello.dao.EmployeeDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceImplTest  {
	
	//ALL MOCKS
	    @Mock
	    EmployeeDao dao;
	    
	    @Spy
	    SomeClass sc; // = new SomeClass("11111");
	 
	    @InjectMocks
	    EmployeeServiceImpl employeeService;
	 
	    @Spy
	    List<Employee> employees = new ArrayList<Employee>();
	 
	    @Captor
	    ArgumentCaptor<Employee> captor;
	 
	    @Before
	     public void setUp() {
	        MockitoAnnotations.initMocks(this);
	        employees = getEmployeeList();
	    }
	
	//TEST1--------------
	    /*
	     * Scenario for Successful [error-free] data persistence
	     * Void method stubbing example
	     */
//	    @Test
//	    public void saveEmployee() {
//	        /*
//	         * Instruct mockito to do nothing when dao.saveEmployee will be called.
//	         */
//	        doNothing().when(dao).saveEmployee(any(Employee.class));
//	        employeeService.saveEmployee((Employee)employees.get(0));
//	         
//	        /*
//	         * Verify that dao.saveEmployee was indeed called one time. 
//	         */
//	        verify(dao, times(1)).saveEmployee(captor.capture());
//	 
//	  
//	    }
	//-----------TEST2
	    /*
	     * Same as above test case, demonstrates 'doAnswer().when' pattern
	     * Void method stubbing example
	     */
//	    @Test(expected = RuntimeException.class)
//	    public void deleteEmployeeBySsnNotExistAgain() {
//	        /*
//	         * Alternate way to Instruct mockito to throw an exception when dao.deleteEmployeeBySsn will be called.
//	         */
//	        doAnswer(new Answer<Object>() {
//	            public Object answer(InvocationOnMock invocation) {
//	                Object[] args = invocation.getArguments();
//	                String arg = (String) args[0];
//	                if (arg.equals("UNKNOWN_SSN")) {
//	                    throw new RuntimeException("Item not present");
//	                }
//	                return null;
//	            }
//	        }).when(dao).deleteEmployeeBySsn(anyString());
//	        employeeService.deleteEmployeeBySsn("UNKNOWN_SSN");
//	        verify(dao, atLeastOnce()).deleteEmployeeBySsn(anyString());
//	    }
	 //tset3----
//	    @Test
//	    public void deleteEmployeeBySsn() {
//	        /*
//	         * Instruct mockito to do nothing when dao.deleteEmployeeBySsn will be called.
//	         */
//	        doNothing().when(dao).deleteEmployeeBySsn(anyString());
//	        employeeService.deleteEmployeeBySsn(anyString());
//	        verify(dao, times(1)).deleteEmployeeBySsn(anyString());
//	    }
	    //test4--
//	    public List<Employee> someTime(String ssn){
//	    	sc.access(ssn);
//	    	return dao.findAllEmployees();
//	    }
	    @Test
	    public void someTime() {
//	        doAnswer(new Answer<Object>() {
//            public Object answer(InvocationOnMock invocation) {
//                Object[] args = invocation.getArguments();
//                String arg = (String) args[0];
//                System.out.println("when(sc).fuctionOne(anyString())@@@@@@@@@@@@@@@@@@@@@@@@@@@:=  " + arg);
////                if (arg.equals("UNKNOWN_SSN")) {
////                    throw new RuntimeException("Item not present");
////                }
//                return null;
//            }
//        }).when(sc).fuctionOne(anyString());
	    	doAnswer((i) -> {
	    		System.out.println("when(sc).fuctionOne(anyString())@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	    		return null;
	    	}).when(sc).fuctionOne(anyString());
	    	doAnswer((i) -> {
	    		System.out.println(".when(sc).fuctionTwo()@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	    		return null;
	    	}).when(sc).fuctionTwo();
//	    	doAnswer((i) -> {
//	    		return null;
//	    	}).when(sc).access(anyString());
	    	sc.access("harsh");
	    	
	    	verify(sc, times(1)).access(anyString()); 
	    	verify(sc, times(1)).fuctionOne(anyString()); 
	    	verify(sc, times(1)).fuctionTwo(); 
	    }
	    
	
	//===TEST DATA
	 public List<Employee> getEmployeeList() {
	        Employee e1 = new Employee();
	        e1.setId(1);
	        e1.setName("Axel");
	        e1.setSsn("11111");
	 
	        Employee e2 = new Employee();
	        e1.setId(2);
	        e2.setName("Jeremy");
	        e2.setSsn("11112");
	 
	        employees.add(e1);
	        employees.add(e2);
	        return employees;
	    }

}
