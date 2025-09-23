


package OOPsPractice;

public class Practice_Sum {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="  asdf fdsf asfg   ";
		System.out.println(s);
		
		
		String[] dd = s.strip().split(" ");
//		for(int i=0;i<dd.length;i++) {
//			System.out.println(dd[i]);
//		}
		for(String i:dd) {
			System.out.println(i.trim());
		}
		System.out.println();
		int[]A= {1,2,7,2,9,8,2,7,5,4,9,-1,17,-1,12};
		int N=A.length;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if(A[i]==A[j]) {
					A[j]=-1;
				}
			}
		}
		for(int i=0;i<N;i++) {
			System.out.print(A[i]+" ");
		}
		int p1=0;
		for(int i=0;i<N;i++) {
			if(A[i]!=-1) {
				int temp=A[i];
				A[i]=A[p1];
				A[p1]=temp;
				p1++;
			}
		}
		System.out.println();
		for(int i=0;i<N;i++) {
			System.out.print(A[i]+" ");
		}
		
	}

}
