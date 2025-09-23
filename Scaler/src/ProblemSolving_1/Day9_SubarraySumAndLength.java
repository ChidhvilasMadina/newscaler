/*Given an array A of length N. Also given are integers B and C.
Return 1 if there exists a subarray with length B having sum C and 0 otherwise
*/


package ProblemSolving_1;

public class Day9_SubarraySumAndLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {4, 2, 2, 5, 1};
		int N=A.length;
		int B=4;
		int c=6;
		int ans=0;
		if(N==1 && B==1 && A[0]==c) {
			
		}
		for(int i=0;i<B;i++) {
			ans+=A[i];
		}int end=B;
		for(int i=1;end<N;i++) {
			ans=ans=A[i-1]+A[end];
			end++;
			if(ans==c) {
				System.out.println("there exists a subarray with length "+B +"having sum "+c);
				return;
			}
		}
		System.out.println("there is no subarray with length "+B +" having sum "+c);

	}

}
