/*You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.

You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.
*/


package ProblemSolving_2;

import java.util.Arrays;

public class Day017_ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rtfubuhbjnjihubyvttfTYFESWZQAZDVGBYHNUMJ";
		int N=s.length();
		char[] c=new char[N];
		for(int i=0;i<N;i++) {
			char ch=s.charAt(i);
			c[i]=(char) (ch^32);
			//System.out.print(c[i]+" ");
		}
		String x=Arrays.toString(c);
        String p=String.valueOf(c);
        System.out.println(x);
        System.out.println(p);

	}

}
