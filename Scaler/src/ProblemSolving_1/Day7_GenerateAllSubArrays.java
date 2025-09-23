/*You are given an array A of N integers.
Return a 2D array consisting of all the subarrays of the array
Note : The order of the subarrays in the resulting 2D array does not matter.
*/


package ProblemSolving_1;

public class Day7_GenerateAllSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {5, 2, 1, 4};
		int N=A.length;
		int M=(N*(N+1))/2;
		int[][] subarrays=new int[M][];
		int length=0;
		for(int i=0;i<N;i++) {
			for(int j=i;j<N;j++) {
				int[] sub=new int[j-i+1];
				int ind=0;
				System.out.print("{");
				for(int k=i;k<=j;k++) {
					sub[ind++]=A[k];
					System.out.print(A[k]+" ");
				}
				System.out.print("},");
				subarrays[length++]=sub;
			}
			System.out.println(" ");
		}

	}

}
