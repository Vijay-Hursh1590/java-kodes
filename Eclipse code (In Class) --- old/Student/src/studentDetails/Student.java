package studentDetails;

public class Student {

	private int id;
	private String name;
	private double subject1;
	private double subject2;
	private double subject3;

	
	
	
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




	public double getSubject1() {
		return subject1;
	}




	public void setSubject1(double subject1) {
		this.subject1 = subject1;
	}




	public double getSubject2() {
		return subject2;
	}




	public void setSubject2(double subject2) {
		this.subject2 = subject2;
	}




	public double getSubject3() {
		return subject3;
	}




	public void setSubject3(double subject3) {
		this.subject3 = subject3;
	}




	public String toString()
	{
		String s;
		s = "Student Details:\n\n" +
        "ID: " + String.format("%d", this.id) + "\n" +
        "Name: " + this.name + "\n" +
        "Subject 1 : " + this.subject1 + "\n" + 
        "Subject 2 : " + this.subject2 + "\n" + 
        "Subject 3 : " + this.subject3 + "\n" + 
        "Total Percentage : " + total();
		
		return s;
        
	}
	
	public double total()
	{
		double tot = this.subject1 + this.subject2 + this.subject3;
		double totPer = tot/3;
		return totPer;
	}

	public static void main(String[] args) 
	{
		Student stud = new Student();
		stud.setId(123);
		stud.setName("Amit");
		stud.setSubject1(98);
		stud.setSubject2(89);
		stud.setSubject3(91);
		String studentData = stud.toString();
		System.out.println(studentData);
		
	}

}
