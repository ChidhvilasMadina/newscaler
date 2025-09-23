/*Given an integer array A of size N and an integer B, 
you have to return the same array after rotating it B times towards the right.
*/

package ProblemSolving_1;

public class day4_array_rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1, 2, 3, 4,5};
		int B=2;
		int N=A.length;
		B%=N;
		swap(A,0,N-1);
		swap(A,0,B-1);
		swap(A,B,N-1);
		
		for(int i=0;i<N;i++) {
			System.out.println(A[i]);
		}

	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int start=i,end=j;
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		//return a;
	}

}
