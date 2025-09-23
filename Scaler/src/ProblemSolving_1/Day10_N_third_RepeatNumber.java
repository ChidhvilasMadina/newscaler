/*You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.
If there are multiple solutions, return any one.
Note: Read-only array means that the input array should not be modified in the process of solving the problem
*/
package ProblemSolving_1;

import java.util.Arrays;

public class Day10_N_third_RepeatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {4,1,45,4,1,4,86,4,87};
		int N=A.length;
		Arrays.sort(A);
		int count=0;
		int reqCount=(int)N/3;
		int ans=0;
		for(int i=1;i<N;i++){
            if(A[i-1]==A[i]){
                count++;
            }
            if(count>reqCount){
                ans=A[i];
            }
	     }
		System.out.println(ans);
	}

}
