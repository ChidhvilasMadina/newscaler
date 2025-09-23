package ProblemSolving_2;

import java.util.Arrays;

public class Day015_Multipleiterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1,2,3,4,5};//6,31,33,13,82,66,9,12,69,21,17,2,50,69,90,71,31,1,13,70,94,46,89,13,55,54,67,97,28,27,62,34,41,18,15,35,13,84,93,27,89,23,6,56,94,40,54,95,47
		int[] B= {2,3};
		//int[] B= {88,85,98,36,66,40,30,26,51,77,62,60,92,64,53,86,24,53,85,49,57,29,32,60,75,82,17,23,67,51,23,11,70,59};
		int N=A.length;
        int M=B.length;
        int[][] result=new int[M][];
        A=reverse(A,0,N-1);
        for(int i=0;i<M;i++){
            int k=B[i]%N;
            int[] arr=Arrays.copyOf(A, N);
            reverse(arr,0,k);
            reverse(arr,k+1,N-1);
            result[i]=arr;
        }
        for(int i=0;i<M;i++) {
        	System.out.print("{");
        	for(int j=0;j<N;j++) {
        		System.out.print(result[i][j]+" ");
        	}
        	System.out.println("},");
        }
    }
    static int[] reverse(int[] arr,int start,int end){
        for(int i=start,j=end;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
//        for(int k=0;k<arr.length;k++) {
//        	System.out.print(arr[k]+" ");
//        }
        //System.out.println();
        return arr;
    }
    

	}
