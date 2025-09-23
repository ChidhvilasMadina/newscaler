/*You are given a string S, and you have to find all the amazing substrings of S.
An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
*/



package ProblemSolving_1;

public class Day6_AmazingSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="amazon";
		int N=s.length();
		int count=0;
		int temp=0;
		for(int i=N-1;i>=0;i--) {
			temp++;
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u') {
				count+=temp;
			}
		}
		System.out.println("Total number of  Subarrays = "+ count);

	}

}
