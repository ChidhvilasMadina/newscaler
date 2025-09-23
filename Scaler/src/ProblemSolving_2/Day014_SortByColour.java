/* Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will represent the colors as,

red -> 0
white -> 1
blue -> 2

Note: Using the library sort function is not allowed.
*/

package ProblemSolving_2;

public class Day014_SortByColour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {2,0,1,1,0,0,2,2,2,1,1,1,0,0,0};
		int N=A.length;
		int a=0;
		int b=N-1;
		for(int i=0;i<b;) {
			if(A[i]==0) {
				int temp=A[a];
				A[a]=A[i];
				A[i]=temp;
				a++;i++;
			}
			else if(A[i]==2) {
				int temp=A[b];
				A[b]=A[i];
				A[i]=temp;
				b--;
			}
			else
				i++;
		}
		for(int i=0;i<N;i++) {
			System.out.println(A[i]);
		}

	}

}
