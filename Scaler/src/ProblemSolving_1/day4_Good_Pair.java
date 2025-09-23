/* Given an array A and an integer B.
 *  A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). 
 *  Check if any good pair exist or not.*/

package ProblemSolving_1;

public class day4_Good_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1,2,3,4};
		int num=7;
		int N=A.length;
		for(int i=0;i<N;i++) {
			for(int j=N-1;j>i;j--) {
				if(A[i]+A[j]==num) {
					System.out.println("Good pair Exists");
				}
			}
		}
		System.out.println("Good Pair does not Exists");
	}

}


/*public int solve(int[] A, int B) {
        int len=A.length;        
          for(int i=0;i<len;i++){
              for(int j=0;j<i;j++){
                  if(i!=j && A[i]+A[j]==B){
                      return 1;
                  }                  
                                                    
              }
          } 
                       return 0;   
    }
    */
