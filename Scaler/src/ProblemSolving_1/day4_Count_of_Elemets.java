/* Given an array A of N integers. 
   Count the number of elements that have at least 1 elements greater than itself.
*/

package ProblemSolving_1;

public class day4_Count_of_Elemets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A= {3, 1, 2};
		int[] A= {5,5,3};
		int N=A.length;
		int max=0,count=0;
		
		for(int i=0;i<N;i++) {
			if(max<A[i]) {
				count=0;
				max=A[i];
			}
			if(max==A[i]) {
				count++;
			}		
		}
		System.out.println("Number of elements having greater than themself are "+ (N-count));
	}

}
