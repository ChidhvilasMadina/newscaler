/*Surprisingly, in an alien language, 
 * they also use English lowercase letters, but possibly in a different order. 
 * The order of the alphabet is some permutation of lowercase letters.

Given an array of words A of size N written in the alien language, 
and the order of the alphabet denoted by string B of size 26, 
return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.

 */
package ProblemSolving_2;

import java.util.HashMap;
import java.util.Map;

public class Day019_Dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] A = {"hello", "scaler", "interviewbit","s"};
		 String B = "adhbcfegskjlponmirqtxwuvzy";
		 Map<Character,Integer> order=new HashMap<>();
		 int N=B.length();
		 int index=0;
		 for(int i=0;i<N;i++)	{
			 char c=B.charAt(i);
			 if(!order.containsKey(c)) {
				 order.put(c, index);
				 index+=1;
			 }
		 }
		 for(int i=0;i<A.length-1;i++) {
			 char a=A[i].charAt(0);
			 char b=A[i+1].charAt(0);
			 if(order.get(a)-order.get(b)<0) {
				 continue;
			 }
			 else {
				 System.out.println("The String Array is not lexicographically arranged");
				 return ;
			 }
		 }
		 System.out.println("The String Array is lexicographically arranged");		 

	}

}
