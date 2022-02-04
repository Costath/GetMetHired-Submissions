package Assignment5;

//1.	How to use super keyword in case of method overriding

class Parentclass
{
	//Overridden method
	void display(){
		System.out.println("This is parent class method");
	}
}

//Complete following class:

class Subclass extends Parentclass
{
	@Override
	void display(){
		System.out.println("Child class method");
	}
	void printMsg(){
		display();
		super.display();
	}
	public static void main(String args[]){		
		Subclass obj = new Subclass();
	   
		obj.printMsg();
	}
}

/*
Output
Child class method
Parent class method
*/