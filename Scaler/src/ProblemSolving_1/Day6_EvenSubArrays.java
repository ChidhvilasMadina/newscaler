package ProblemSolving_1;

public class Day6_EvenSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A= {2, 4, 8, 7, 6};
		int N=A.length;
		if((N%2)==0 && A[0]%2==0 && A[N-1]%2==0) {
			System.out.println("The subArray can be divided into Even Subarrays");
		}
		else {
			System.out.println("The Subarray cannot n be divided into Even subarrays");
		}
	}

}
