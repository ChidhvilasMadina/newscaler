/*
 * Find the number of occurrences of bob in string A consisting of lowercase English alphabets.
 */

package ProblemSolving_2;

public class Day017_CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="asdbobdsfbob";
		int N=A.length();
		String compare="bob";
		int m=compare.length();
		int end=m;
		int count=0;
		//System.out.println(start+" "+ end+" "+A.substring(start,end));
		//String window=A.substring(start,end);
		for(int i=0;end<=N;i++,end++) {
			String window=A.substring(i,end);
			if(compare.equals(window)) {
				count++;
			}
		}
		System.out.println(count);		

	}

}
