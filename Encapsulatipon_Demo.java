package Encapsulation;
import java.util.Scanner;

 class Encapsulatipon_Demo {
	public static void main (String ...args) {
	Scanner s = new Scanner(System.in);	
	String Studentname;
	int    studentpass,sid;
	int sub1,sub2,sub3,sub4,sub5;
	
	System.out.println("ENTER YOUR NAME :  ");
	Studentname = s.nextLine();
	System.out.println("ENTER YOUR USER_ID :  ");
	sid = s.nextInt();
	System.out.println("ENTER YOUR PASSWORD:  ");
	studentpass = s.nextInt();
	
	System.out.println("ENTER MARKS OF 5 SUBJECT :");
	
	System.out.println("ENTER MARKS OF SUB 1 :  ");
	sub1 = s.nextInt();
	System.out.println("ENTER MARKS OF SUB 2 :  ");
	sub2 = s.nextInt();
	System.out.println("ENTER MARKS OF SUB 3 :  ");
	sub3 = s.nextInt();
	System.out.println("ENTER MARKS OF SUB 4 :  ");
    sub4 = s.nextInt();
    System.out.println("ENTER MARKS OF SUB 5 :  ");
    sub5 = s.nextInt();
    
    encap_d obj = new encap_d();
    
    obj.set_name(Studentname);
    obj.set_pass(studentpass);
    obj.set_student_id(sid);
    
    System.out.println(" NAME :"  +obj.get_name());
    System.out.println(" USER ID :"  +obj.get_name());
    System.out.println(" password :"  +obj.get_name());
    obj.calculate(sub1,sub2,sub3,sub4,sub5);
    System.out.println(" percentage :"+obj.percentage);
	}
}
    class encap_d {
    	private String Student_name ;
    	private int Student_id;
    	private int password;
    	int total,percentage;
    	
    	public String get_name()
    	{
    		return Student_name;
    	}
    	
		
		public int get_student_id()
    	{
    		return Student_id;
    	}
    	public int get_pass()
    	{
    		return password;
    	}
    	public void set_name(String Student)
    	{
    		Student_name = Student;
    	}
    	public void set_student_id(int student)
    	{
    		Student_id = student;
    	}
    	public void set_pass(int student)
    	{
    		password = student;
    	}
    	public void calculate (int sub1,int sub2, int sub3, int sub4, int sub5) 
    	{
    		total = sub1+sub2+sub3+sub4+sub5;
    		percentage = total/5;
    		if (percentage >=35 && percentage<45) {
    			System.out.println("D GRADE");
    		}
    		else if (percentage>=45 && percentage<55) {
    			System.out.println("c GRADE");
    		}
    		else if (percentage>=55 && percentage<75) {
    			System.out.println("B GRADE");
    		}
    		else if (percentage>=75 && percentage<85) {
    			System.out.println("A GRADE");
    		}
    		else if (percentage<=85 && percentage>100) {
    			System.out.println("O GRADE");
    		}
    		else {
    			System.out.println("FAILED");
    		
    		}
    			
    	
    	}
    }
