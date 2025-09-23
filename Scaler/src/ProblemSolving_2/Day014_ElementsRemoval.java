/*Given an integer array A of size N. You can remove any element from the array in one operation.
The cost of this operation is the sum of all elements in the array present before this operation.

Find the minimum cost to remove all elements from the array.
*/

package ProblemSolving_2;

import java.util.Arrays;
import java.util.Collections;

public class Day014_ElementsRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1,2,3,4,5};
		int N=A.length;
		int sum=0;
		Arrays.sort(A);
		int x=1;
		for(int i=N-1;i>=0;i--) {
			sum+=A[i]*x++;
		}
		System.out.println(sum);

	}

}

/*int N=A.length;
int mincost=0;
Arrays.sort(A);
int x=N;
for(int i=0;i<x;i++){
    int temp=A[i];
    A[i]=A[x-1];
    A[x-1]=temp;
    x--;        
}
for(int j=1;j<=N;j++){
    mincost+=A[j-1]*j;
    
}
return mincost;
*/