/*Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.
*/

package ProblemSolving_1;

public class Day7_GoodSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
		int N=A.length;
		int B=65;
		int count=0;
		for(int i=0;i<N;i++) {
			int sum=0;
			for(int j=i;j<N;j++) {
				sum+=A[j];
				int length=j-i+1;
				if(length%2==0 && sum<B) {
					count++;
				}
				if(length%2!=0 && sum>B) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
