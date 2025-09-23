
package ProblemSolving_2;

import java.util.ArrayList;

public class Day016_contest2_problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {7,2,3,2,-1,8,1,9};
		int N=A.length;
		int min1=A[0];
		int min2=Integer.MAX_VALUE;
		int count=0;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=1;i<N;i++) {
			if(A[i]<min1) {
				min2=min1;
				min1=A[i];
			}
			if(A[i]<min2&&A[i]!=min1) {
				min2=A[i];
			}
		}
		for(int i=0;i<N;i++) {
			if(A[i]>min1 && A[i]>min2) {
				arr.add(A[i]);
				count++;
				
			}
		}
		System.out.println(min1+" "+min2);
		System.out.println(count);
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}

	}

}
