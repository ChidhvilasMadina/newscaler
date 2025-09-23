/*You are given a function to_lower() which takes a character array A as an argument.




Convert each character of A into lowercase characters if it exists. If the lowercase of a character does not exist, it remains unmodified.
The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.

Return the lowercase version of the given character array.
*/

package ProblemSolving_2;

public class Day017_ToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AASRRSGASFHHJVCBASORFJDSPAI";
		int N=s.length();
		char[] c=new char[N];
		for(int i=0;i<N;i++) {
			char ch=s.charAt(i);
			c[i]=(char) (ch+32);
			System.out.print(c[i]+" ");
		}

	}

}
