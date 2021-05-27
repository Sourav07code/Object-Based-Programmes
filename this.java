package UseOfThisKeyword;

class This{
	int x;//instance variables
	int y;
	// constructor with parametere list(local variable)
	This(){  
		//default constructor
	}
	This(int x){
		this.x=x;
		System.out.println("hello");
	}
	This(int x,int y){
	    this(x);//method calling
	    
	    this.y=y;
	    System.out.println(x+" "+y);
	}
}

public class A {
	
	

	public static void main(String[] args) {
		This obj=new This();
		This obj1=new This(5);

	}

}
