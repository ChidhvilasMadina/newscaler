/*Given an array A and an integer B, find the number of occurrences of B in A.
 * 
 */

package ProblemSolving_1;

public class day4_linearSearch_multipleOcurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A= {1, 2, 2};
		int N=A.length;
		int B=2;
		int count=0;
		for(int i=0;i<N;i++) {
			if(A[i]==B) {
				count++;
			}
		}
		System.out.println("The number '"+B+"' have repeated '"+ count+"' times");

	}

}
