/*You are given an array A of N integers and an integer B. Count the number of pairs (i,j) such that A[i] + A[j] = B and i ≠ j.

Since the answer can be very large, return the remainder after dividing the count with 109+7.

Note - The pair (i,j) is same as the pair (j,i) and we need to count it only once.
*/

package ProblemSolving_2;

import java.util.HashMap;
import java.util.Map;

public class Day019_CountPairsofsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {3, 5, 1, 2};
		int N=A.length;
		int b=6;
		int count=0;
		Map<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<N;i++) {
			int pair=b-A[i];
			if(hm.containsKey(pair)) {
				count+=hm.get(pair);
			}
			if(hm.containsKey(A[i])) {
				hm.put(A[i], hm.get(A[i])+1);
			}
			else {
				hm.put(A[i], 1);
			}
		}
		System.out.println(count);
	}

}

/*
 * int N=A.length;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();        
        for(int i=0;i<N;i++){
            int num=B-A[i];
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }
            else{
                map.put(A[i],1);
            }
            if(A[i]!=num && map.containsKey(num)){
                count+=map.get(num);
            }
            if(A[i]==num && map.get(A[i])>1){
                count=count+map.get(num)-1;
            }
        }
        return (count%1000000007); 
        */
