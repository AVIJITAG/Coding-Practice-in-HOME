  // Arithmetic Exception 

package EXCEPTION_HANDLING;

public class Try_Catch_Exception {                                           // class create -
            public static void main (String ...args) {                      // main method   -
            	System.out.println(" main method Started");
            
            	  int a = 10, b = 0, c ;                                   // value create   -
            
            try {
            	c = a/b ;                                                 // c = 10/0  - (EXCEPTION occur)
            	System.out.println(c);
            }
                  
            catch(ArithmeticException e) {                               // catch  - handling exception 
            	System.out.println("can not be devied by zero ");
            	
            }
            System.out.println(" main method Ended ");
            }
}
