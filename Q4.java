//4.	Create a class shape, it has two variables length and breadth and a function getdata() to initialize the values of length and breadth. Inherit this class to another class Rectangle which contains a function area() to compute and display the area of Rectangle. ( length = 10, breadth = 15).

		
package questions;

class Rectangle extends shape{
	void area(){
		System.out.println("Area of given rectangle is: " + (base * height));
		}
	}

public class Q4 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.getData(10, 15);
		r.area();
		}
	}
