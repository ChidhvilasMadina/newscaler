package ProblemSolving_1;


//// did it save
public class day1_Find_Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=100;
		int noOfFactors=0;
		for(int i=1;i*i<=input;i++) {
			if((input%i)==0) {
				System.out.println(i+" "+input/i);
				if(i==(input/i)) {
					noOfFactors++;
				}
				else
					noOfFactors+=2;
			}
		}
		
	System.out.println("number of  factors are "+noOfFactors);

	}

}
