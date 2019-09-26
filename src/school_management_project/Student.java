package school_management_project;

/**
 * 
 * @author Mario
 * 
 * Keeps track of student fees, name, grade & fees
 *
 */


public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * To create a new student by initializing
	 * fees for every student is $30,000
	 * fees paid initially is 0
	 
	 * @param id
	 * @param name
	 * @param grade
	 */
	Student(int id,String name,int grade){
		feesPaid=0;
		feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	
	
	//updating student's grade
	//@param grade new grade of the student
	public void setGrade(int grade) {
		this.grade=grade;
	}
	
	//Add the fees to the fees paid.
	//The school is going to receive funds.
	//@param fees the fees that student paid.
	
	public void PaidFees(int fees) {
		
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	
	public int getId() {
	
		return this.id;
	}
	
	
	public String Getname() {
		
		return this.name;
	}
	
	public int getGrade() {
		
		return this.grade;
	}
	
	
	public int feesPaid() {
		
		return this.feesPaid;
	}
	
	
	public int feesTotal() {
		
		return this.feesTotal;
	}
	
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}
	
}

