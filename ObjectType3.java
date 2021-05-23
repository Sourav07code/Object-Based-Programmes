package ques3;
import java.util.Scanner;
public class A2Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Exam[] e=new Exam[5];
		for(int i=0;i<5;i++) {
			e[i]=new Exam();
			System.out.println("Enter student details: ");
			String name=sc.next();
			int roll=sc.nextInt();
			String course=sc.next();
			e[i].input_Student(roll,name,course);
			System.out.println("Enter marks");
			int m1=sc.nextInt(),m2=sc.nextInt(),m3=sc.nextInt();
			e[i].input_Marks(m1,m2,m3);
			e[i].display_Result();
		}
		sc.close();
	}

}
