/*
 * You are given a string A of size N consisting of lowercase alphabets.
You can change at most B characters in the given string to any other lowercase alphabet 
such that the number of distinct characters in the string is minimized.
Find the minimum number of distinct characters in the resulting string.
 */



package ProblemSolving_2;

import java.util.Arrays;

public class Day017_MinimumDistinctCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hq";
		int B=0;
		int N=str.length();
		int[] arr=new int[26];
		int count=0;
		for(int i=0;i<N;i++) {
			int index=str.charAt(i)-97;
			arr[index]+=1;
		}
		for(int i=0;i<26;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Arrays.sort(arr);
//		for(int i=0;i<26;i++) {
//			System.out.print("index"+ i+"="+arr[i]+";  ");
//		}
		System.out.println();
		for(int i=0;i<26;i++) {
			if((B>=arr[i])) {
				B=B-arr[i];
				arr[i]=0;
			}
			if(arr[i]!=0) {
				count++;
			}
			//System.out.print("index"+ i+"="+arr[i]+";  ");
		}
		System.out.println(count);
		
		
	}

}
