package ProblemSolving_2;

public class Day017_Anarogams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A= "bgipsvukg";
		String B= "ylwfyulte";
		int N=A.length();
        int[] Afreq=new int[26];
        int[] Bfreq=new int[26];
        for(int i=0;i<N;i++){
            int Aindex=A.charAt(i)-'a';
            int Bindex=B.charAt(i)-'a';
            Afreq[Aindex]+=1;
            Bfreq[Bindex]+=1;
        }
        for(int i=0;i<26;i++){
            if(Afreq[i]!=Bfreq[i]){
                System.out.println("the Given Strings are not anarogms");
                return;
            }
        }
        System.out.println("the Given Strings are anarogms");

	}

}
