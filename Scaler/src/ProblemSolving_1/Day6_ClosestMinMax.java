/*Given an array A, find the size of the smallest subarray 
 * such that it contains at least one occurrence of the maximum value of the array
 * and at least one occurrence of the minimum value of the array.
 */


package ProblemSolving_1;

public class Day6_ClosestMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {2, 6, 1, 6, 9};
		int N=A.length;
		int max=A[0];
		int min=A[0];
		int minIndex=-1;
		int maxIndex=-1;
		int ans=N;
		for(int i=0;i<N;i++) {
			if(A[i]>max) {
				max=A[i];
			}
			if(A[i]<min) {
				min=A[i];
			}
		}
		if(min==max) {
			System.out.println("length is 1");
			return;
		}
		for(int i=0;i<N;i++) {
			int len=N;
			if(A[i]==min) {
				minIndex=i;
				for(int j=i+1;j<N;j++) {
					if(A[j]==max) {
						maxIndex=j;
						len=j-i+1;
						if(len<ans) {
							ans=len;
						}
						break;
					}
					
				}
			}
			if(A[i]==max) {
				maxIndex=i;
				for(int j=i+1;j<N;j++) {
					if(A[j]==min) {
						minIndex=j;
						len=minIndex-maxIndex+1;
						if(len<ans) {
							ans=len;
						}
						break;
					}
				}
			}
		}
		System.out.println("the smallest subArray with min and Max id "+ ans);
	}

}
