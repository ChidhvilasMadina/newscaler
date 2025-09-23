/*You have given a string A having Uppercase English letters.
You have to find how many times subsequence "AG" is there in the given string.
NOTE: Return the answer modulo 109 + 7 as the answer can be very large
*/


package ProblemSolving_1;

public class Day6_SpecialSubsequences_AG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] A= {'A','B','C','G','A','G'};
		
		int N=A.length;
		int noOfG=0;
		int count=0;
		int ans=0;
		for(int i=N-1;i>=0;i--) {
			if(A[i]=='G') {
				count++;
			}
			else if(A[i]=='A') {
				ans+=count;
			}
		}
		System.out.println(ans);

	}

}
