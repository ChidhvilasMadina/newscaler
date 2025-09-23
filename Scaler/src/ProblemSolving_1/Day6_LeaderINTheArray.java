/*Given an integer array A containing N distinct integers, 
 * you have to find all the leaders in array A. 
 * An element is a leader if it is strictly greater than all the elements to its right side.
 */

package ProblemSolving_1;

public class Day6_LeaderINTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {93,57,83,41,100,10,79,27,94,22,4,96,48,18,89,37,21,5,46,81,15,30,47,23,34,65,55,9,36,20,54,17,7,56,78,84,87,97,16,69,28,11,44,49,8,25,98,75,53,62,19,24,80,68,50,91,1,86,77,14,72,66,42,63,73,45,31,61,85,64,35,32,92,71,74,3,99,52,90,43,6,40,38,2,12,59,29,82,76,60,67,13,70,58,39,33,95,88,51,26};
		int N=A.length;
		int max=0;
		int count=0;
		for(int i=N-1;i>=0;i--) {
			if(A[i]>max) {
				max=A[i];
				count++;
				System.out.println(max);
			}
			
		}
		System.out.println("Number of leaders="+count);
		
		
		
//		  int N=A.length;
//	        int max=A[N-1];
//	        int count=1;
//	        for(int i=N-2;i>=0;i--){
//	            if(A[i] > max){
//	                max=A[i];
//	                count++;
//	            
//	            }
//	        }
//	        int[] ans=new int[count];
//	        max=A[N-1];
//	        ans[0]=max;
//	        int j=1;
//	        for(int i=N-1;i>=0;i--){
//	            if(A[i]>max){
//	                ans[j++]=A[i];
//	                max=A[i];
//	            }	            
//	        }
//	        for(int i=0;i<count;i++) {
//	        	System.out.println(ans[i]);
//	        }

	}

}


//[93,57,83,41,100,10,79,27,94,22,4,96,48,18,89,37,21,5,46,81,15,30,47,23,34,65,55,9,36,20,54,17,7,56,78,84,87,97,16,69,28,11,44,49,8,25,98,75,53,62,19,24,80,68,50,91,1,86,77,14,72,66,42,63,73,45,31,61,85,64,35,32,92,71,74,3,99,52,90,43,6,40,38,2,12,59,29,82,76,60,67,13,70,58,39,33,95,88,51,26]
