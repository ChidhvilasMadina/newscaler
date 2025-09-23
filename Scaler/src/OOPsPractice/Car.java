package OOPsPractice;

import java.util.Comparator;

public class Car implements Comparator<Car>{
	private double price;
	private int speed;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Car(double price, int speed) {
		super();
		this.price = price;
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Car [price=" + price + ", speed=" + speed + "]";
	}
	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
