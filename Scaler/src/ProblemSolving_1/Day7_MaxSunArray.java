/*You are given an integer array C of size A. 
 * Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
 * But the sum must not exceed B.
 */

package ProblemSolving_1;

public class Day7_MaxSunArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] C= {3,8,8,9,7};
		int A=C.length;
		int B=72;
		int ans=0;
		for(int i=0;i<A;i++) {
			int sum=0;
			for(int j=i;j<A;j++) {
				sum+=C[j];
				if(sum<=B) {
					if(ans<sum) {
						ans=sum;
					}
				}
			}
		}
		System.out.println(ans);
	}

}


/*int max=0;
        for(int i=0;i<A;i++){
            int sum=0;
            for(int j=i;j<A;j++){
                sum+=C[j];
                if(sum<=B){
                    if(sum>max){
                        max=sum;
                    }
                }
                else{
                    break;
                }                
            }            
        } 
        return max;
        */
