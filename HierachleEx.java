 class Person{     //Base class or parent class or super class.
	public String name;
	public void inputName(String name) {
		this.name=name;
	}
}

/* extends keyword is a keyword that inherits the parent class in sub class*/

 class Student extends Person{   //Derived class or sub class or child class.
	public int roll;
	public void inputRoll(int roll) {
		this.roll=roll;
	}
	public void display() {
		System.out.println(name+" "+roll);
	}
}
 class Teacher extends Person{   //Derived class or sub class or child class.
	public int empId;
	public void inputEid(int empId) {
		this.empId=empId;
	}
	public void display() {
		System.out.println(name+" "+empId);
	}
}
 
public class HierachleEx {

	public static void main(String[] args) {
		Student s=new Student();
		s.inputName("sourav");
		s.inputRoll(07);
        s.display();
        Teacher t= new Teacher();
        t.inputEid(204100);
        t.inputName("Deshmukh");
        t.display();
	}

}
