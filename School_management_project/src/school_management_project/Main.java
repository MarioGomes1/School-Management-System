package school_management_project;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher Lizzy = new Teacher(1, "Lizzy", 500);
		Teacher Melissa = new Teacher(2, "Melissa", 700);
		Teacher Vanderhorn = new Teacher(1, "Vanderhorn", 600);
		
		List<Teacher>teacherList= new ArrayList<>();
		teacherList.add(Lizzy);
		teacherList.add(Melissa);
		teacherList.add(Vanderhorn);
		
		
		
		Student Tamasha = new Student(1,"Tamasha",4);
		Student Rak = new Student(2,"Rak",12);
		Student Rabbi = new Student(3,"Rabbi",5);
				
		List<Student>studentList = new ArrayList<>();
		studentList.add(Tamasha);
		studentList.add(Rak);
		studentList.add(Rabbi);
		
		
		School bhs = new School(teacherList, studentList);
		
		
		Tamasha.PaidFees(5000);
		System.out.println("bhs has earned:$ " +bhs.getTotalMoneyEarned());
		Rabbi.PaidFees(6000);
		System.out.println("bhs has earned:$ " +bhs.getTotalMoneyEarned());
		
		
		Lizzy.receiveSalary(Lizzy.getSalary());
		System.out.println("bhs has paid : "  +Lizzy.getName()+" and now has :$ " +bhs.getTotalMoneyEarned());

		
		
	}

}
