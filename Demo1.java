package Abstraction;

public interface Demo1 { // INTERFACE DECLARATION:
	void display();
}
 class DemoTest implements Demo1 {  // 1ST IMPLEMENTATION:
	 public void display() {
		 System.out.println("DISPLAY SCREEN");
	 }
 }
    class DemoTest1 implements Demo1 {   // 2ND IMPLEMENTATION:
    	public void display() {
    		System.out.println("DISPLAY NO : 1");
    	}
    public static void main (String ...args) {
    	Demo1 obj = new DemoTest1();
    	obj.display();
    }
    }