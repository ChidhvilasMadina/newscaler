/*On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.

Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
*/
package ProblemSolving_2;

public class Day022_KthSymbol {

	public static void main(String[] args) {
		int A = 4;
		int B = 7;
		System.out.println("the Kth Eelement is "+ kthSymbol(A, B));
	}
	public static int kthSymbol(int A,int B) {
		if(A==1 &&B==0) {
			return 0;
		}
		int x=kthSymbol(A-1,B/2);
		if(x==0) {
			if(B%2==0) {
				return 0;
			}
			else {
				return 1;
			}
		}
		else {
			if(B%2==0) {
				return 1;
			}
			else {
				return 0;
			}
		} 
	}

}
