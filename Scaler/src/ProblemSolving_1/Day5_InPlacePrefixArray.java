package ProblemSolving_1;

public class Day5_InPlacePrefixArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1, 2, 3, 4, 5};
		int N=A.length;
		for(int i=1;i<N;i++) {
			A[i]+=A[i-1];
			System.out.println(A[i]);
		}
	}

}
