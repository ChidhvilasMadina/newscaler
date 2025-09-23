package ProblemSolving_2;

public class Day017_CountSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {3,7,7,8,3,8,1,5,8,7,1,7,9,3,2};
		int N=A.length;
		int max=0;
		for(int i=0;i<N;i++) {
			if(A[i]>max) {
				max=A[i];
			}
		}
		int[] arr=new int[max+1];
		for(int i=0;i<=max;i++) {
			int index=A[i];
			arr[index]=arr[index]+1;
		}
		int p=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i];j++) {
				A[p++]=i;
				System.out.print(i);
			}
		}

	}

}
