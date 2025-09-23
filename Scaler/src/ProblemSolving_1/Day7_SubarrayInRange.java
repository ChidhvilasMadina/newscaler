/*Given an array A of length N, return the subarray from B to C.*/

package ProblemSolving_1;

public class Day7_SubarrayInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {4, 3, 2, 6};
		int N=A.length;
		int start=1,end=3;
		int[] arr=new int[end-start+1];
		int index=0;
		for(int i=start;i<=end;i++) {
			System.out.println(A[i]);
			arr[index++]=A[i];
		}
//		System.out.println("-----------------");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}

	}

}
