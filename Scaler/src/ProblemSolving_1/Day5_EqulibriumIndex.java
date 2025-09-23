/*You are given an array A of integers of size N.
Your task is to find the equilibrium index of the given array
The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
Note:
Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.
*/

package ProblemSolving_1;

public class Day5_EqulibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {-7, 1, 5, 2, -4, 3, 0};
		int N=A.length;
		int count=0;
		for(int i=1;i<N;i++) {
			A[i]=A[i-1]+A[i];
		}
		int left=0;
		System.out.println("The Equlibrium Indexes are ");
		for(int i=0;i<N;i++) {
			if(i>0) {
				left=A[i-1];
			}
			int right=A[N-1]-A[i];
			if(left==right) {
				count++;
				System.out.println(i+",");
			}
		}
		System.out.println("the Total numbe of equlibrium indexes are "+ count);
	}

}
