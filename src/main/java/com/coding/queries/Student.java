package com.coding.queries;
/**
 * @author Naveen K Wodeyar 
 * @date 26-Jun-202411:38:21 am
 * @classDef com.coding
 */
public class Student {

	private String stName;
	private String stSubject;
	private double stMarks;
	/**
	 * @return the stName
	 */
	public String getStName() {
		return stName;
	}
	/**
	 * @param stName the stName to set
	 */
	public void setStName(String stName) {
		this.stName = stName;
	}
	/**
	 * @return the stSubject
	 */
	public String getStSubject() {
		return stSubject;
	}
	/**
	 * @param stSubject the stSubject to set
	 */
	public void setStSubject(String stSubject) {
		this.stSubject = stSubject;
	}
	/**
	 * @return the stMarks
	 */
	public double getStMarks() {
		return stMarks;
	}
	/**
	 * @param stMarks the stMarks to set
	 */
	public void setStMarks(double stMarks) {
		this.stMarks = stMarks;
	}
	/**
	 * @param stName
	 * @param stSubject
	 * @param stMarks
	 */
	public Student(String stName, String stSubject, double stMarks) {
		super();
		this.stName = stName;
		this.stSubject = stSubject;
		this.stMarks = stMarks;
	}
	@Override
	public String toString() {
		return "Student [stName=" + stName + ", stSubject=" + stSubject + ", stMarks=" + stMarks + "]";
	}

}
