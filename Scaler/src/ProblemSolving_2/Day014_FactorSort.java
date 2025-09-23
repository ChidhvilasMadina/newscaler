/*You are given an array A of N elements. 
 * Sort the given array in increasing order of number of distinct factors of each element, 
 * i.e., element having the least number of factors should be the first to be displayed and the number having highest number of factors should be the last one. 
 * If 2 elements have same number of factors, then number with less value should come first.
 */


package ProblemSolving_2;

public class Day014_FactorSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]A= {6,9,78,99,33,56,87};
		int N=A.length;
		

	}
	int factors(int a) {
		int count=0;
		for(int i=0;i*i<=a;i++) {
			if(a%i==0) {
				if(i==(a/i)) {
					count++;
				}
				else {
					count+=2;
				}
			}
		}
		return count;
	}

}
