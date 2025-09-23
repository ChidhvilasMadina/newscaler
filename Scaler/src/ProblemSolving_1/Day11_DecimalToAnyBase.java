/*Given a decimal number A and a base B, convert it into its equivalent number in base B.
 * 
 */

package ProblemSolving_1;

public class Day11_DecimalToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=13;
		int B=2;
		int place=0;
		int ans=0;
		while(A>0) {
			int d=A%B;
			d=(int) (d*Math.pow(10,place));
			ans+=d;
			place++;
			A=A/B;
		}
		System.out.println(ans);

	}

}
