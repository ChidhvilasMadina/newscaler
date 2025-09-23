/*You are given a function to_upper() consisting of a character array A.

Convert each character of A into Uppercase character if it exists. If the Uppercase of a character does not exist, it remains unmodified.
The lowercase letters from a to z is converted to uppercase letters from A to Z respectively.

Return the uppercase version of the given character array.
*/

package ProblemSolving_2;

public class Day017_ToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="qetyyuiyiomnubyvcrxeezzzazwafghnjimop";
		int N=s.length();
		char[] c=new char[N];
		for(int i=0;i<N;i++) {
			char ch=s.charAt(i);
			if(ch>=97&&ch<=122 ) {
				c[i]=(char) (ch-32);
				System.out.print(c[i]+" ");
			}
			
        }

     }
}
