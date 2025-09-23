/*Given an integer A representing a year, Return 1 if it is a leap year else, return 0.
A year is a leap year if the following conditions are satisfied:
The year is multiple of 400.
or the year is multiple of 4 and not multiple of 100.
*/

package ProblemSolving_2;

public class Day013_LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2020;
		if(year%400==0) {
			System.out.println("the given Year is a leap year");
		}
		else if(year%4==0 & year%100!=0) {
			System.out.println("the given Year is a leap year");
		}
		else {
			System.out.println("the given Year is Not a leap year");
		}
		

	}

}
