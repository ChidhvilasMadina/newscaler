/*Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:

Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.

NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
*/

package ProblemSolving_2;

public class Day017_StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="AbcaZeoB";
		int N=str.length();
		String ans="";
		for(int i=0;i<N;i++) {
			char c=str.charAt(i);
			if(c>=65 && c<=90) {
				continue;
			}
			else if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				ans+='#';
			}
			else {
				ans+=c;
			}
		}
		ans+=ans;
		System.out.println(ans);

	}

}
