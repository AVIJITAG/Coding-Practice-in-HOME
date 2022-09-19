package Abstraction;
// achieve multiple inheritance using interfaces:
public interface Demo2 {  // 1st interface:
	void show();
}
 interface Demo3 {  // 2nd interface:
	 void print();
 }
class Example implements Demo2,Demo3{
	public void show() {
		System.out.println("SHOW");
	}
    public void print() {
    	System.out.println("PRINT");
    }
   public static void main (String ...args) {
	   Example obj = new Example();
	   obj.show();
	   obj.print();
   }
   }