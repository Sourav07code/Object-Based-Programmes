package object;

import java.util.*;
public class Student4 {
	int regd;
	String name;
	void yourDetails() {
		Scanner in=new Scanner (System.in);
		
		System.out.println("Enter you regd and name ");
			regd=in.nextInt();
			name=in.next();
			
		}
		
	void display() {
		System.out.println("Name="+name+" "+"registration number="+regd);
	}

	public static void main(String[] args) {
		Student4 input=new Student4();
		Scanner in=new Scanner(System.in);
		System.out.println("Total no. of students");
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
		
		input.yourDetails();
		input.display();
		}

	}
	

}
