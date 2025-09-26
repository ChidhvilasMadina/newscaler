/*Implement pow(A, B) % C.
In other words, given A, B and C, Find (AB % C).
Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.
*/

package ProblemSolving_2;

public class Day021_ImplementPoweFunction {

	public static void main(String[] args) {
		int A = 2170811;
		int B = 4;
		int C = 9;
		System.out.println(pow(A,B,C));
	}
	public static int pow(int A,int B,int C) {
		if(A==0) {return 0;}
		if(B==0) {return 1;}
		long P=pow(A,B/2,C);
		P=(P*P)%C;
		if(B%2==1) {
			P=(P*A)%C;
		}
		P=(P+C)%C;
		return (int) P;
	}

}
