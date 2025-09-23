package OOPsPractice;

public class Triangle extends Shape {
	int length;
	int height;
	
	public Triangle(int length,int height){
		this.length=length;
		this.height=height;
	}
	@Override
	public double calculateArea() {
		
		return 0.5*(this.length*this.height);
	}

}
