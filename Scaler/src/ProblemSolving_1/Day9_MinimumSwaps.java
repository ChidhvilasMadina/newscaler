/* Given an array of integers A and an integer B, 
 * find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.
 * Note: It is possible to swap any two elements, not necessarily consecutive
 */



package ProblemSolving_1;

public class Day9_MinimumSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1, 12, 10, 3, 14, 10, 5};
		int B = 8;
		int N=A.length;
		int count=0;
		for(int i=0;i<N;i++) {
			if(A[i]<=B) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(0);
			return;
		}
		int bigNum=0;
		for(int i=0;i<count;i++) {
			if(A[i]>B) {
				bigNum++;
			}
		}
		int ans=bigNum;
		int end=count;
		for(int i=1;end<N;i++) {
			if(A[i-1]>B) {
				bigNum--;
			}
			if(A[end]>B) {
				bigNum++;
			}
			end++;
			if(bigNum<ans) {
				ans=bigNum;
			}
		}
		System.out.println(bigNum);

	}

}
