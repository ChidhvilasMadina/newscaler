/*A wire connects N light bulbs.
Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.
Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
You can press the same switch multiple times.
Note: 0 represents the bulb is off and 1 represents the bulb is on.
*/


package ProblemSolving_1;

public class Day6_Bulbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {0,1,0,1,0};
		int N=A.length;
		int count=0;
		int state=0;
		for(int i=0;i<N;i++) {
			if((count%2)==0) {
				state=A[i];
			}
			else {
				state=1-A[i];
			}
			if(state==0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
