/*Given a number A, check if it is a magic number or not.

A number is said to be a magic number 
if the sum of its digits is calculated till a single digit recursively by adding the sum of the digits after every addition. 
If the single digit comes out to be 1, then the number is a magic number.
*/


package ProblemSolving_2;

public class Day022_IsMagicNumber {

	public static void main(String[] args) {

		int A = 1234;
		System.out.println(isMagicNumber(A));
	}
	public static String isMagicNumber(int A) {
		
		if(A==1) {return "Given Number is a Magic Number";}
		if(A<10) {
			return "The Given number is not a magic number";
		}
		A=sum(A);
		return isMagicNumber(A);		
	}
	public static int sum(int A) {
		if (A<10) {
			return A;
		}
		return A%10 + sum(A/10);
	}

}
