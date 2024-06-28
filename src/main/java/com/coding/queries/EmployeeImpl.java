package com.coding.queries;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
/**
 * @author Naveen K Wodeyar 
 * @date 25-Jun-20248:11:21 pm
 * @classDef com.coding
 */
public class EmployeeImpl {
	
	public static void main(String[] args) {

		List<Employee> employeeList  = new ArrayList<>();
		
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Bhaskar", 31, "Male", "Product Development", 2012, 315700.0));
		
		System.out.println("\nAll Employees:");
        employeeList.forEach(System.out::println);

        Map<String, Long> empCount = employeeList.stream().map(Employee::getGender).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("\nGender count "+empCount);

        
        List<String> deptList = employeeList.stream().map(Employee::getDepartment).distinct().toList();
        System.out.println("\nDepartment list "+deptList);
        
        
        Map<String, Double> avgSal = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        avgSal.forEach((gender, avgSalary) -> System.out.println("\n"+gender + ": " + String.format("%.2f", avgSalary)));

        
        double maxSalary = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).orElseThrow().getSalary();
        Double maxSal = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).map(Employee::getSalary).orElseThrow();
        System.out.println("\nHighest paid employee with salary:"+maxSal+" "+maxSalary);
	
        
        List<Employee> list = employeeList.stream().filter(e->e.getYearOfJoining() > 2015).toList();
        System.out.println("\nEmployees joined after 2015 "+list);
        
        
        Map<String, Long> deptCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println("\n Employee count in each dept: "+deptCount);
        
        Map<String, Double> avgDeptSal = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("\nAverage salary of dept "+avgDeptSal);
        
        
        Employee junior = employeeList.stream().filter(e->e.getDepartment().equalsIgnoreCase("Product Development") && e.getGender().equalsIgnoreCase("Male")).min(Comparator.comparing(Employee::getAge)).orElseThrow(null);
        System.out.println("\nYoungest Male employee Product Development,\nName: "+junior.getName()+" \nAge:"+junior.getAge());
     
        Employee senior = employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).orElseThrow();
        System.out.println("\nSeniormost employee in the organization:"+senior.getName()+"\nJoined year:"+senior.getYearOfJoining());
	
        Map<String, Long> genderCount = employeeList.stream().filter(e->e.getDepartment().equalsIgnoreCase("Sales and Marketing")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println("\nGender count in  sales and marketing team "+genderCount);
			
        
        Map<String, Double> genderAvgSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("\nAverage salary in gender:"+genderAvgSalary);
        
        Map<String, List<Employee>> empList = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(empList);
        
        DoubleSummaryStatistics stasticis = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("\nSalary Statistics "+stasticis);
        
        Map<Boolean, List<Employee>> emp25 = employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge()>25));
        System.out.println(emp25);

        for (java.util.Map.Entry<Boolean, List<Employee>> entry : emp25.entrySet()) {
        	if(entry.getKey()) {
        		System.out.println("Employees older than 25");
        	}
        	else
        	{
        		System.out.println("Employees younger than 25");
        	}
        	System.out.println("---------");
        	for(Employee e:list) {
        		System.out.println(e.getName());
        	}
        }
     
        
        Employee oldestEmp = employeeList.stream().max(Comparator.comparing(Employee::getAge)).orElseThrow(null);
        System.out.println("\n Oldest employee "+oldestEmp.getAge()+"-"+oldestEmp.getName()+"-"+oldestEmp.getDepartment());
	}

}
