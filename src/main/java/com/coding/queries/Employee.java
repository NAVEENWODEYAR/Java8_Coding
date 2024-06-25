package com.coding.queries;
/**
 * @author Naveen K Wodeyar 
 * @date 25-Jun-20248:06:53 pm
 * @classDef com.coding
 */
public class Employee {

	private int empId;
	
	private String empName;
	
	private int empAge;
	
	private String empGender;
	
	private int empJoiningYear;
	
	private double empSalary;

	
	public Employee() {}


	/**
	 * @param empId
	 * @param empName
	 * @param empAge
	 * @param empGender
	 * @param empJoiningYear
	 * @param empSalary
	 */
	public Employee(int empId, String empName, int empAge, String empGender, int empJoiningYear, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empGender = empGender;
		this.empJoiningYear = empJoiningYear;
		this.empSalary = empSalary;
	}


	/**
	 * @param i
	 * @param string
	 * @param j
	 * @param string2
	 * @param string3
	 * @param k
	 * @param d
	 */
	public Employee(int i, String string, int j, String string2, String string3, int k, double d) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empGender = empGender;
		this.empJoiningYear = empJoiningYear;
		this.empSalary = empSalary;
	}


	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}


	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}


	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}


	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}


	/**
	 * @return the empAge
	 */
	public int getEmpAge() {
		return empAge;
	}


	/**
	 * @param empAge the empAge to set
	 */
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}


	/**
	 * @return the empGender
	 */
	public String getEmpGender() {
		return empGender;
	}


	/**
	 * @param empGender the empGender to set
	 */
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}


	/**
	 * @return the empJoiningYear
	 */
	public int getEmpJoiningYear() {
		return empJoiningYear;
	}


	/**
	 * @param empJoiningYear the empJoiningYear to set
	 */
	public void setEmpJoiningYear(int empJoiningYear) {
		this.empJoiningYear = empJoiningYear;
	}


	/**
	 * @return the empSalary
	 */
	public double getEmpSalary() {
		return empSalary;
	}


	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	

	
}
