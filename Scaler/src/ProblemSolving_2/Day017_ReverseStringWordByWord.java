/*You are given a string A of size N.


Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.
*/

package ProblemSolving_2;

public class Day017_ReverseStringWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="  the sky     is Beautiful   ";
		char[] c=str.toCharArray();
		int N=str.length();
		String current="";
		String ans="";
		int count=0;
		for(int i=N-1;i>=0;i--) {
			
		//	String word="";
			if(str.charAt(i)!=' ') {
				current=str.charAt(i)+current;				
			}
			else if(!current.isEmpty()) {
				
				if(!ans.isEmpty()) {
					ans+=" "+current;
				}
				else {
					ans+=current;
				}				
				current="";
			}
			
			
		}
		System.out.println(ans);

	}

}
