/*Given an array A of N integers and also given two integers B and C. 
 * Reverse the elements of the array A within the given inclusive range [B, C].
 */


package ProblemSolving_1;

public class day4_reverse_in_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1, 2, 3, 4};
		int start=1,end=3;
		int N=A.length;
		while(start<end) {
			int[] arr=swap(A,start,end);
			start++;
			end--;
		}
		for(int i=0;i<N;i++) {
			System.out.println(A[i]);
		}
	}

	

	private static int[] swap(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		int temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		
		return a;
	}

}
