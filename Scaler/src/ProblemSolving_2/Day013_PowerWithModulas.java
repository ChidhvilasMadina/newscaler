//You are given A, B and C .
//Calculate the value of (A ^ B) % C

package ProblemSolving_2;

public class Day013_PowerWithModulas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=5;
		int B=4;
		int c=9;
		long ans=1;
		for(int i=0;i<B;i++ ) {
			ans=(ans*A)%c;
		}
		System.out.println(ans);

	}

}
