/*You have an array A with N elements. We have two types of operation available on this array :
We can split an element B into two elements, C and D, such that B = C + D.
We can merge two elements, P and Q, to one element, R, such that R = P ^ Q i.e., XOR of P and Q.
You have to determine whether it is possible to convert array A to size 1, containing a single element equal to 0 after several splits and/or merge?
*/


package ProblemSolving_1;

public class Day11_IntrestingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {5,7,2,14,56,19};
		int N=A.length;
		int count=0;
		for(int i=0;i<N;i++) {
			if(A[i]%2!=0) {
				count++;
			}
		}
		if(count%2==0) {
			System.out.println("it is possible to convert");
		}
		else {
			System.out.println("its not possible to convert");
		}

	}

}
