package ProblemSolving_2;

public class Day017_AddBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A= "11100";
		String B="110";
		int N=Math.max(A.length(),B.length());
        int i=N-1,mod=0,div=0;
        char Abit=A.charAt(N-1);
        char Bbit=B.charAt(N-1);
        String ans="";
        while(i>=0 || div!=0){
            
            mod=(Abit+Bbit+div)%2;
            ans=mod+ans;
            div=(Abit+Bbit+div)/2;
            i--;
            if(i<0){
                Abit=0;
                Bbit=0;
            }
            else{
                Abit=A.charAt(i);
                Bbit=B.charAt(i);
            }
        }
        System.out.println(ans);

	}

}
