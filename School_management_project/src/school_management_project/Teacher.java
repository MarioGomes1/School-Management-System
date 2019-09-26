package school_management_project;

/**
 * 
 * @author mario
 *this class is responsible for keeping the track of teacher's name
 */

public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	
	public Teacher(int id, String name, int salary) {
	
	this.id = id;
	this.name = name;
	this.salary=salary;
	this.salaryEarned=0;
	
	}


	public int getId() {
		return id;
	}



	public String getName() {
		return this.name;
	}



	public int getSalary() {
		return this.salary;
	}
	


	public void setSalary(int salary) {
		this.salary = salary;
		
	}
	
	
	/*
	 * add to the salary
	 * and removes from total money earned to School
	 */
	public void receiveSalary(int salary) {
		salaryEarned =+ salary;
		School.updateTotalMoneySpent(salary);
		
	}
}

