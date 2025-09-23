package OOPsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> cars=new ArrayList();
		cars.add(new Car(1000000.00,80));
		cars.add(new Car(1500000.00,80));
		cars.add(new Car(1200000.00,80));
		cars.add(new Car(1600000.00,80));
		cars.add(new Car(2000000.00,70));
		cars.add(new Car(2000000.00,120));
	 
		cars.stream().sorted((a,b)->Double.compare(b.getPrice(), a.getPrice())).forEach(System.out::println);
	}
	
	

}
