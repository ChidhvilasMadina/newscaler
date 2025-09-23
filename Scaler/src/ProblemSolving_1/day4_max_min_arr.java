
/*Given an array A of size N. 
 * You need to find the sum of Maximum and Minimum element in the given array.
 */
package ProblemSolving_1;

public class day4_max_min_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {-2, 1, -4, 5, 3};
		int N=A.length;
		int max=0,min=0;
		int sum=0;
		for(int i=0;i<N;i++) {
			if(min>A[i]) {
				min=A[i];
			}
			if(max<A[i]) {
				max=A[i];
			}
		}
		sum=min+max;
		System.out.println("min="+min+"|| max="+max+"|| sum="+sum);
		
	}

}
