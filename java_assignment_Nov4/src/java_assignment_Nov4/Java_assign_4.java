package java_assignment_Nov4;

/*
 * The following Java applications contain errors. Point out the statement(s) that contain errors. 
 * Explain what each of the errors is, and how it can be fixed. 
 * 
 */

public class Java_assign_4 { 
    public static void main(String[] args) { 
        A1 objA = new A1(); 
        System.out.println("in main(): "); 
        System.out.println("objA.a = "+objA.a); //calls on original 'a' value w/i class A (100)
        objA.a = 222; //(ERR) does not change 'a' value 
        objA.setA(222); //(FIX) does change 'a' value 
        System.out.println("objA.a = "+objA.a);
    } 
} 
 
//(ERR) cannot have 2 public classes, (FIX) removed public flag 
//(prev: public class A)
class A1 { 
	//(ERR) 'a' not visible in main method
	//(FIX) changed to public
	//(prev: private int a = 100)
    public int a = 100; 
    public void setA( int value) { 
        a = value; 
} 
    public int getA() { 
        return a; 
    } 
} //class A 
