/*Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).
*/

package ProblemSolving_2;

public class Day017_LongestPallendromSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abba";
		int N=str.length();
		String ans="";
		
		for(int i=0;i<N;i++) {
			String temp=""+str.charAt(i);
			int start=i-1;int end=i+1;{
				while(start>=0 && end<N && (str.charAt(start)==str.charAt(end))) {
						temp=str.charAt(start)+temp+str.charAt(end);
						start--;end++;
				}
				if(temp.length()>ans.length()) {
					ans=temp;
				}
			}
					
		}
		for(int i=0;i<N;i++) {
			int p1=i,p2=i+1;
			String temp="";
			while(p1>=0 && p2<N) {
				if(str.charAt(p1)==str.charAt(p2)) {
					temp=str.charAt(p1)+temp+str.charAt(p2);			
				}
				p1--;
				p2++;
			}
			if(temp.length()>ans.length()) {
				ans=temp;
			}
			
		}
		System.out.println(ans);
	}

}
