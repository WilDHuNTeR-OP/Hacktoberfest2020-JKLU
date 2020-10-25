//1.	Write a set of overloaded functions min() that returns the smaller of two numbers passed to them as arguments. Make versions for int and float.

package questions;

public class Q1 {

	double min(int a, int b) {
		int minn = 0;
		if (a >= b) {minn = b;
		}
		else {minn = a;}
		return minn;}
	
	double min(float a, float b){
		float minn = 0;
		if (a >= b) {minn = b;
		}
		else {minn = a;}
		return minn;}

	public static void main(String[] args) {

	Q1 a = new Q1();
	
	System.out.println(a.min(10,20));
	System.out.println(a.min(2.6f, 8.5f));
}
}
