/*Given an array, arr[] of size N, 
 * the task is to find the count of array indices such that 
 * removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
 */

package ProblemSolving_1;

public class Day10_SpecialIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1, 1, 1};
		int N=A.length;
		int[] even=new int[N];
		int[] odd=new int[N];
		even[0]=A[0];
		int esum=A[0];
		int osum=0;
		for(int i=1;i<N;i++) {
			if(i%2==0) {
				esum+=A[i];
			}
			else {
				osum+=A[i];
			}
			even[i]=esum;
			odd[i]=osum;
		}
		for(int i=0;i<N;i++) {
			System.out.println(even[i]+" || "+odd[i]);
		}
		int count=0;
		if((even[N-1]-even[0])==odd[N-1]) {
			count++;
		}
		for(int i=1;i<N;i++) {
			int evensum=0;
			int oddsum=0;
			evensum=even[i-1]+odd[N-1]-odd[i];
			oddsum=odd[i-1]+even[N-1]-even[i];
			if(evensum==oddsum) {
				count++;
			}
		}
		System.out.println(count);
		

	}
	

}
