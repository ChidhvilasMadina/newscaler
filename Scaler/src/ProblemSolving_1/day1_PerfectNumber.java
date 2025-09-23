package ProblemSolving_1;

public class day1_PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		int sum=1;
		for(int i=2;i*i<num;i++) {
			if((num%i)==0) {
				if(i==(num/i)) {
					sum+=i;
				}
				else {
					sum=sum+i+(num/i);
				}
			}
		}
		if(sum==num){
			System.out.println(num+" is  perfect Number");
		}
		else
		System.out.println(num+ " is not a perfect Number");

	}

}
