/*You are given an integer array A of size N.
You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
Find and return the maximum possible sum of the B elements that were removed after the B operations.
NOTE: Suppose B = 3, and array A contains 10 elements, then you can:
Remove 3 elements from front and 0 elements from the back, OR
Remove 2 elements from front and 1 element from the back, OR
Remove 1 element from front and 2 elements from the back, OR
Remove 0 elements from front and 3 elements from the back.
*/


package ProblemSolving_1;

public class Day6_PickFromBothSides {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {-533,-666,-500,169,724,478,358,-38,-536,705,-855,281,-173,961,-509,
				-5,942,-173,436,-609,-396,902,-847,-708,-618,421,-284,718,895,447,726,
				-229,538,869,912,667,-701,35,894,-297,811,322,-667,673,-336,141,711,-747,
				-132,547,644,-338,-243,-963,-141,-277,741,529,-222,-684,35};
		int B=48;
		int N=A.length;
		int maxSum=0;
		for(int i=0;i<N;i++) {
			int sum=0;
			for(int j=0;j<i;j++) {
				sum+=A[j];
			}
			for(int j=0;j<B-i;j++) {
				sum+=A[N-1-j];
			}
			if(sum>maxSum) {
				maxSum=sum;
			}
		}
		System.out.println(maxSum);
	}
	

}





/*int N=A.length;
        int max=0;
        int a=0,b=0;
        int[] S=new int[N];
        int X=N;
        for(int i=0;i<N;i++){
            S[i]=A[X-1];
            X--;
        }
        for(int i=0;i<B;i++){
            if(A[a]>S[b]){
                max+=A[a];
                a++;
            }
            else{
                max+=S[b];
                b++;
            }
        }
        return max;
*/