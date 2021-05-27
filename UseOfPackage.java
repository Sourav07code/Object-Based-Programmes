package pack1;

public class A{
 public void message(){
    System.out.println("hey");
  }
}


/* now creating  a another pacakge name pack2 in which we use the above  method which we have created */

package pack2;

import pack1.*; //this will refer all the classes present in pack1
import pack2.*;//this statement will refer a particular class in pack1

public class A{
  public static void main(String args[]){
    A a = new A();
    a.message();//calling method
  }
}
