package school_management_project;

import java.util.List;

public class School {
	
	
	private List<Teacher>teachers;
	private List<Student>students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/*
	 * new school objected created
	 * list of teachers in the school
	 * list of students in the school
	 */
	public School(List<Teacher> teachers, List<Student> students){
		
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}

	/*
	 * returns list of teachers in the school
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}
/*
 * adds teacher to the school
 */
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	/*
	 * returns list of student in the school
	 */
	public List<Student> getStudents() {
		return students;
	}
	
	
	/*
	 * adds student to the school
	 * @param student the student to be added(as an argument)
	 */
	public void addStudent(Student student) {
		 students.add(student);
	}

	
	/*
	 * return total money earned by the school
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
/*
 * adds total money earned by the school
 */
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
		
	}
/*
 * returns the total money spent by the school
 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
	} 
	
	
	
}
