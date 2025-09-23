/*You are given a number A in the form of a string.
 *  Check if the number is divisible by eight or not.
 */

package ProblemSolving_2;

public class Day013_DivisibilityBy8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="1456";
		int N=num.length();
		int sum=0;
		for(int i=N-1;i>N-4;i--) {
			sum=(sum+(int)num.charAt(i));			
		}
		if(sum%8==0) {
			System.out.println("num is divisible by 8");
		}
		else {
			System.out.println("num is not divisible by 8");
		}
	}

}

/*int t=1;
long dig=0;
for(int i=A.length()-1;i>=0;i--) {
		char c=A.charAt(i);
		long num=(c*t)%8;
		dig=(dig+num)%8;
		t=(t*10)%8;
}
if(dig==0){
    return 1;
}
else 
return 0;
*/