//2.	Write a set of overloaded functions power() that returns the Xn where n is integer and X may be int and float.

		
package questions;

public class Q2 {
		
		double power(int n, int x){
			return Math.pow(x, n);
			}
		
		double power(int n, float x){
			return Math.pow(x, n);
			}
		
		public static void main(String[] args) {
			
			Q2 a = new Q2();
			System.out.println(a.power(2, 10));
			System.out.println(a.power(2, 2.5f));
		}


}
