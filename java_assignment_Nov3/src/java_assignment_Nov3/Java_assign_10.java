package java_assignment_Nov3;

/*
 * 10.	I have created a class Calculator 
 * inside a package name com.hcl 
 
package com.hcl; 
public class Calculator { 
   public int add(int a, int b){ 
return a+b; 
   } 
} 
how to use add method from another package. 
 

 */
import com.hcl.Calculator;

public class Java_assign_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		System.out.println(c.add(2, 3));

	}

}
