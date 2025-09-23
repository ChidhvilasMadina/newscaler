package ProblemSolving_1;

public class day1_SqrtOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=625;
		
		/*
		for(int i=1;i<num;i++) {
			if(i*i>=num) {
				if(i*i==num) {
					System.out.println(num+" is a perfect Square");
				}
				else
					System.out.println(num+" is not a Perfect Square");
				
				break;
			}
		}
		*/
		
		int ans=0;
		int i=1;
		while(i*i<=num) {
			ans=i;
			if(i*i==num) {
				System.out.println("Square root of "+num+" is "+ ans);
			}
			else {
				System.out.println(num+" is not a perfecr Square");
			}
			i++;
		}

	}

}
