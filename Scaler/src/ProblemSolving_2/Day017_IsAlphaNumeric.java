/*You are given a function isalpha() consisting of a character array A.
Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.
*/
package ProblemSolving_2;

public class Day017_IsAlphaNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c= {'S', 'c', 'a', 'l', 'e', 'r', 'A', '*', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
		int N=c.length;
		for(int i=0;i<N;i++) {
			if(c[i]>=48 && c[i]<=57) {
				continue;
			}
			else if(c[i]>=65 && c[i]<=90) {
				continue;
			}
			else if(c[i]>=97 && c[i]<=122) {
				continue;
			}
			else {
				System.out.println("the given array is not alphanumeric");
				break;
			}
		}

	}

}
