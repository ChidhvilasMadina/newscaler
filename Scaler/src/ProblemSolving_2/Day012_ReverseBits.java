
//Reverse the bits of an 32 bit unsigned integer A.

package ProblemSolving_2;

public class Day012_ReverseBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=234;
		int result=0;
		for(int i=0;i<32;i++) {
			result<<=1;
			result|=(A&1);
			A>>=1;
		}
		System.out.println(result);

	}

}
