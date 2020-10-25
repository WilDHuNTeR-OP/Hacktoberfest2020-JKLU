//2. Write JAVA program, which reads 4 numbers a, b, c and p. Let f(x)=ax2+bx+c be a function. The program outputs the value of f(p). e.g. input 4 3 –1 2 output 4(2)2+3(2)1= 21. 

package Assignment1;

import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, p, x;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        p = input.nextInt();
        x = p;
        x = ((a * (x * x)) + (b * x) + c);
        System.out.print("Answer " + x);
    }

}
