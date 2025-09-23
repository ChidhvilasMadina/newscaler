package ProblemSolving_1;

public class day1_IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=11;
		int noOfFactors=countfactors(input);
		if(noOfFactors==2) {
			System.out.println(input+" is a Prime Number");
		}
		else
		System.out.println(input+" not a prime number");

	}

	private static int countfactors(int input) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i*i<=input;i++) {
			if((input%i)==0) {
				if(i==(input/i)) {
					count++;
				}
				else {
					count+=2;
				}
			}
		}
		return count;
		
	}

}
