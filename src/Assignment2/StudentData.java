package Assignment2;

public class StudentData {

	private int stuID;
	private String stuName;
	private int stuAge;
	
	// default-constructor
	public StudentData () {
		this.stuID = 123;
		this.stuName = "Robert Richard";
		this.stuAge = 23; 
	}
	
	// parameterized constructor
	public StudentData (int ID, String Name, int Age) {
		this.stuID = ID;
		this.stuName = Name;
		this.stuAge = Age;
	}
	
	public String getStuName() {
		return this.stuName;
	}
	
	public int getStuAge() {
		return this.stuAge;
	}
	
	public int getStuID() {
		return this.stuID;
	}
 
	public static void main(String args[])
	{
		//This object creation would call the default constructor
		StudentData myobj = new StudentData();
		System.out.println("Student Name is: "+myobj.getStuName());
		System.out.println("Student Age is: "+myobj.getStuAge());
		System.out.println("Student ID is: "+myobj.getStuID());
 
		/*This object creation would call the parameterized
		 * constructor StudentData(int, String, int)*/
		StudentData myobj2 = new StudentData(555, "Chaitanya", 25);
		System.out.println("Student Name is: "+myobj2.getStuName());
		System.out.println("Student Age is: "+myobj2.getStuAge());
		System.out.println("Student ID is: "+myobj2.getStuID()); 
	}
}
