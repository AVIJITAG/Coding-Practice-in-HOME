package Abstraction;

public  abstract class Abstract {  // PARENT CLASS:
	abstract void method();       // ABSTRACT METHOD:
}
   class Test extends Abstract {   // CHILD CLASS:
	   void method() {              // NON - ABSTRACT METHOD
            System.out.println("METHOD RUNNING SUCCESSFULLY");
	   }
   }
   class NewTest extends Abstract {   // CHILD CLASS 2:
	   void method() {
		   System.out.println("NEW TEST METHOD RUNNING SUCCESSFULLY");
	   }
   public static void main (String ...args) {
	   Abstract obj = new NewTest();
	    obj.method();
	    
   }
   }
