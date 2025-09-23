package ProblemSolving_1;

public class Day8_columnSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int N=A.length;
		int M=A[0].length;
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			int sum=0;
			for(int j=0;j<M;j++) {
				sum+=A[j][i];
			}
			arr[i]=sum;
		}
		for(int i=0;i<N;i++) {
			System.out.println(arr[i]);
		}

	}

}
