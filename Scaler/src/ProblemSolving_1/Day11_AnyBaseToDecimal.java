/*You are given a number A. You are also given a base B. A is a number on base B.
You are required to convert the number A into its corresponding value in decimal number system.
*/

package ProblemSolving_1;

public class Day11_AnyBaseToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=22;
		int B=3;
		int i=0;
		int ans=0;
		while(A>0){
			ans+=(int) ((A%10)*Math.pow(B, i));
			i++;
			A=A/10;
		}
		System.out.println(ans);
	}

}
