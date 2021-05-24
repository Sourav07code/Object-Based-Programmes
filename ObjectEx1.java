package object;

import java.util.*;
public class Student4 {
	int regd;
	String name;
	void YourDetails() {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter you regd and name ");
			regd=sc.nextInt();
			name=sc.next();
			
		}
		
	void Display() {
		System.out.println("Name="+name+" "+"registration number="+regd);
	}

	public static void main(String[] args) {
		Student4 input=new Student4();
		Scanner sc=new Scanner(System.in);
		System.out.println("Total no. of students");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		
		input.YourDetails();
		input.Display();
		}

	}
	

}
