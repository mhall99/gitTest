package java_assignment_Nov2;

/*
 * You are given a partially completed code in the editor. 
 * Modify the code so that the code prints the following text: 
   Hello I am a motorcycle, I am a cycle with an engine. 
   My ancestor is a cycle who is a vehicle with pedals. 

 */

class Cycle{ 
    String define_me(){ 
        return "a vehicle with pedals."; 
    } 
} 
 
class Bike extends Cycle{ 
    String define_me(){ 
        return "a cycle with an engine."; 
    } 
     
    public Bike(){ 
        System.out.println("Hello I am a motorcycle, I am "+ define_me()); 
        String temp=super.define_me(); 
        System.out.println("My ancestor is a cycle who is "+ temp ); 
    } 
     
} 
class java_assign_7{
//class InheritenceExample{ 
    public static void main(String []args){ 
        Bike M=new Bike(); 
        M.define_me();
    } 
} 
