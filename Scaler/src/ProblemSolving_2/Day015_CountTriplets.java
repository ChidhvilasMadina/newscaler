/*You are given an array A of N elements. 
 * Find the number of triplets i,j and k such that i<j<k and A[i]<A[j]<A[k]
 */


package ProblemSolving_2;

public class Day015_CountTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1, 2, 4, 3};
		int N=A.length;
		int count=0;
		for(int i=0;i<N;i++) {
			int leftcount=0;
			for(int j=i-1;j>=0;j--) {
				if(A[j]<A[i]) {
					leftcount++;
				}
			}
			int rightcount=0;
			for(int j=i+1;j<N;j++) {
				int a=A[i];
				int b=A[j];
				if(a<b){
					rightcount++;
				}
			}
			count+=(leftcount*rightcount);
		}
		System.out.println(count);

	}

}
