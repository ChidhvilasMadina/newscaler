/*Given three 2-digit integers, A, B, and C, find out the minimum number obtained by concatenating them in any order.

Return the minimum result obtained.
*/


package ProblemSolving_2;

public class Day013_Concatinate3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={55,20,30};  
        int num=0;      
        for(int i=0;i<3;i++){
            int temp;
            for(int j=0;j<3;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int t=1;
        int ans=0;
        for(int i=arr.length-1;i>=0;i--) {
        	ans+=arr[i]*t;
        	t*=100;
        }
        System.out.println(ans);
		

	}

}
