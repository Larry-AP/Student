package model;

/**
 * Larry Paucar - Lpaucar
 * CIS175 -Spring 2024
 * Jan 27, 2024
 */
public class Student {

	private String Name;
	private int age;
	private char grade;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public Student() {
		super();
	}
	
	public Student(String name) {
		super();
		Name = name;
	}
	
	public String printName() {
		return Name;
	}
	
}
