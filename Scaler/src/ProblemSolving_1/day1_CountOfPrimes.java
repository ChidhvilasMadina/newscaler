package ProblemSolving_1;

public class day1_CountOfPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=100;
		int ans=solve(100);
		System.out.println(ans);
	}

	private static int solve(int A) {
		// TODO Auto-generated method stub
		int count=0;
		
		for(int num=1;num<A;num++) {
			int temp=0;
			for(int j=1;j*j<=num;j++) {
				if((num%j)==0) {
					if(j==(num/j)) {
						temp++;
					}
					else
						temp+=2;
				}
			}
			if(temp==2) {
				count++;
			}			
		}
		return count;
	}

}
