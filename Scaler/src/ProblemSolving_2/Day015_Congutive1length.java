/*Given a binary string A. 
 * It is allowed to do at most one swap between any 0 and 1. 
 * Find and return the length of the longest consecutive 1’s that can be achieved.
 */

package ProblemSolving_2;

public class Day015_Congutive1length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="111011101";
		int length=s.length();
		int[] arr=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=Character.getNumericValue(s.charAt(i));
		}
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int res=0;
		for(int i=0;i<length;i++) {
			int leftcount=0;
			int rightcount=0;
			int sum=0;
			if(arr[i]==0) {
			for(int j=i-1;j>=0;j--) {
				if(arr[j]==0) {
					break;
				}
				else
					leftcount++;
					
			}
			for(int j=i+1;j<length;j++) {
				if(arr[j]==0) {
					break;
				}
				else {
					rightcount++;
				}					
			}
			}
			sum=leftcount+rightcount+1;
			if(sum>res) {
				res=sum;
			}
		}
		System.out.println(res);

	}

}
