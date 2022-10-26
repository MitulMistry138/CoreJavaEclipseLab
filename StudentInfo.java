/*
 * JavaBean Class: Student
 * @author: Mitul Mistry
 * @Date: 26.10.22
 */

package com.Studentfees;

// class Declaration
public class StudentInfo {

	// creating instance of vairable
	private int id;
	private String name;
	private String standard;
	private String course;
	private int fees;

	// super Contructor
	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized contructor
	public StudentInfo(int id, String name, String standard, String course, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.course = course;
		this.fees = fees;
	}

	// getter setter for variables
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	// To string method

	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", standard=" + standard + ", course=" + course
				+ ", fees paid =" + fees + "]";
	}

}