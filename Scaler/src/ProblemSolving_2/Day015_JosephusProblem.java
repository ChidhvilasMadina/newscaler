/*There are A people standing in a circle. 
 * Person 1 kills their immediate clockwise neighbour and pass the knife to the next person standing in circle. 
 * This process continues till there is only 1 person remaining. Find the last person standing in the circle.
 */

package ProblemSolving_2;

public class Day015_JosephusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100000;
		int i=0;
		int x=1<<i;
		int nearperfect=0;int kills=0;
		int position=0;
		while(x<num) {
			i++;
			nearperfect=x;
			x=1<<i;			
		}
		kills=num-nearperfect;
		position=(kills*2)+1;
		System.out.println(position);
	}

}
