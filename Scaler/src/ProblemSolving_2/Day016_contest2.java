
/*you are given A & B, you have create abinary number such that 
 * it has A 1's followed by B 0's and convert the binary to decimal
 */

package ProblemSolving_2;

public class Day016_contest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A=3;
		int B=4;
		int[] arr=new int[A+B];
		int N=arr.length;
		int index=0;
		int ans=0;
		int res=0;
		for(int i=0;i<A;i++) {
			arr[index++]=1;
			res=res|1<<i;
		}
		System.out.println(res);
		for(int i=0;i<B;i++) {
			arr[index++]=0;
			
		}
		res=res<<B;
		for(int i=0;i<N;i++) {
			ans+=(int)arr[i]*Math.pow(2, (N-1-i));
		}
		System.out.println(ans+" "+res);
	}

}
