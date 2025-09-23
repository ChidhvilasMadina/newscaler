package OOPsPractice;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t=new Triangle(5,8);
		System.out.println(t.calculateArea());
		Rectangle r=new Rectangle(7,9);
		System.out.println(r.calculateArea());
		Shape s=new Triangle(7,2);
System.out.println(s.calculateArea());
}

}
