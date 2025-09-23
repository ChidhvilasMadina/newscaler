package ProblemSolving_2;

public class Day017_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="chidhilas kumar";
		int N=s.length();
		int start=0,end=N-1;
		char[] c=s.toCharArray();
		while(start<end) {
			char temp=c[start];
			c[start]=c[end];
			c[end]=temp;
			start++;end--;
		}
		s=String.valueOf(c);
		System.out.println(s);
	}

}
