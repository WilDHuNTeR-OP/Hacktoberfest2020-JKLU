//3.	Create a class shape, it has two variables base and height and a function getdata() to initialize the values of base and height. Inherit this class to another class Triangle which contains a function area() to compute and display the area of triangle. ( base = 10, height = 15).

	
package questions;

class shape{ 
	double base, height;
	void getData(double b, double h){
		base = b;
		height = h;
		}
	}

class Triangle extends shape{
	void area(){
		System.out.println("Area of given triangle is: " + (.5 * base * height));
		}
	}

public class Q3 {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.getData(10, 15);
		t.area();
		}
	}
