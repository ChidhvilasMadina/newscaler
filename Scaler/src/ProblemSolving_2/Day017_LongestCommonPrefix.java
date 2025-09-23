/*Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.


The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
*/

package ProblemSolving_2;

public class Day017_LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"abcgh", "abcghijk", "abcgh"};
		int N=str.length;
		String ans=str[0];
		
		for(int i=0;i<N;i++) {
			int l=ans.length();
			if(str[i].length()<l) {
				l=str[i].length();
			}
		
			String temp="";
			for(int j=0;j<l;j++) {
				if(ans.charAt(j)==str[i].charAt(j)) {
					temp+=ans.charAt(j);
				}
				else {
					break;
				}
			}
			ans=temp;
		}
		System.out.println(ans);

	}

}
