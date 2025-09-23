/* Given an integer A, find and return the Ath magic number.

A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.

First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
*/


package ProblemSolving_2;

public class Day012_FindAthMagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=9;
		int ans=0;
		int result=0;
		for(int i=0;i<32;i++) {
			if((A&(1<<i))==(1<<i)) {
				ans=(int) Math.pow(5, (i+1));
				result+=ans;
			}
			
		}
		
		//i++;
		
		System.out.println(result);

	}

}
