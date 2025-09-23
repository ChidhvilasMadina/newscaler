package ProblemSolving_1;

public class Day4_TimeOfEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {2, 4, 1, 3, 2};
		int N=A.length;
		int max=0,time=0;
		for(int i=0;i<N;i++) {
			if(max<A[i]) {
				max=A[i];
			}
		}
		for(int j=0;j<N;j++) {
			int diff=max-A[j];
			time+=diff;
		}
		System.out.println(time);
	}

}
