package Abstraction;
// AN ABSTRACT CLASS WHICH HAS ABSTRACT,NON- ABSTRACT & CONSTRACTOR;
 abstract class AbstractNew {
	AbstractNew(){ // CONSTRACTOR:
		System.out.println("CONSTRUCTOR CREATED");
	}
	 abstract void show(); // ABSTRACT METHOD:
	 void method1() {     // NON - ABSTRACT METHOD:
		 System.out.println("METHID 1 CREATED");
	 }
}
class Javaabstractclass extends AbstractNew { // CHILD CLASS:
	void show ()
	{
		System.out.println("METHOD RUNNING SUCCESSFULLY");
	}
  public static void main (String ...args){
	  AbstractNew obj = new Javaabstractclass();
	  obj.method1();
	  obj.show();
  
	  
  }
}
