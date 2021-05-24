interface A{
	void display();
	void count();
}
class B implements A{
	static int maxcount;
	String name;
	B(String name){
		this.name=name;
	}
	public void display() {
		System.out.println("The name is "+name);
	}
	public void count(){
		maxcount=name.length();
		System.out.println("The total length of string is "+maxcount);
	}
}
public class ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B("Anonymous");
		a.display();
		a.count();
	}

}
