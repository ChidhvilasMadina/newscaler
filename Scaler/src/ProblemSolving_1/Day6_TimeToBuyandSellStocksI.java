/*Say you have an array, A, for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
design an algorithm to find the maximum profit.
Return the maximum possible profit.
*/



package ProblemSolving_1;

public class Day6_TimeToBuyandSellStocksI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= { 4,1, 5, 2, 4};
		int N=A.length;
		int profit=0;
		if(N==0) {
			System.out.println(0);
		}
		else {
			int min=A[0];
			int max=A[0];
			
			for(int i=0;i<N;i++) {
				if(A[i]<min) {
					min=A[i];
				}
				int temp=A[i]-min;
				if(temp>profit) {
					profit=temp;
				}
			}
		}
		System.out.println(profit);

	}

}




/*int N=A.length;
                
        int  maxProfit=0;
        if(N==0){
            return 0;
        }
        else{
            int minPrice=A[0];
        for(int i=1;i<N;i++){
            if(A[i]>minPrice){
               int  profit=A[i]-minPrice;
               if(profit>maxProfit){
                   maxProfit=profit;
               }
            }
            else{
                minPrice=A[i];
            }
        }
        return maxProfit;  
        }  
        */
