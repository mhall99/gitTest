package java_assignment_Nov4;

/*
 * A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism.
 *  In this problem, you will practice your knowledge on interfaces. 
You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). 
You need to write a class called MyCalculator which implements the interface. 
divisorSum function just takes an integer as input and return the sum of all its divisors. 
For example, divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. 
The value of n will be at most 1000. 
Read the partially completed code in the editor and complete it. 
You just need to write the MyCalculator class only. Your class shouldn't be public. 
Sample Input 
6 
Sample Output 
I implemented: AdvancedArithmetic 
12 
Explanation 
Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12. 

 */
import java.util.*;

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
	public int divisor_sum(int n) {
		// Vector to store half of the divisors
		List<Integer> v = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				//System.out.printf("%d ", i);
				//System.out.println();

				// push the second divisor in the vector
				v.add(n / i);
			}
		}
		//System.out.println("+______");
		//Integer sum = 0;
		int sum = v.stream().mapToInt(Integer::intValue).sum();

		/*
		for (Integer x : v) {
			System.out.println(x);
			sum += x; // sum = sum + x;
			System.out.println(sum);
		}
*/
		System.out.println("I implemented: Advanced Arithmetic");
		System.out.println(sum);
		return sum;
	}
}

public class Java_assign_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator calc = new MyCalculator();
		calc.divisor_sum(6);

	}
}
