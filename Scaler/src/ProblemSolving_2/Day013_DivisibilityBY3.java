/*Given a number in the form of an array A of size N. 
 * Each of the digits of the number is represented by A[i]. Check if the number is divisible by 3.
 */


package ProblemSolving_2;

public class Day013_DivisibilityBY3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1, 0, 0, 1, 2,7};
		int N=A.length;
		int sum=0;
		for(int i=0;i<N;i++) {
			sum=(sum+A[i]);
		}
		if(sum%3==0) {
			System.out.println("the Given Array is divisible by 3");
		}
		else {
			System.out.println(sum+" the Given Array is not divisible by 3");
		}
	}

}
