//1. Write JAVA program, which reads 2 numbers and prints the sum of square of the first and cube of the second. e.g. input 5 3 output 52+33 =52. 

package Assignment1;

import java.util.Scanner;
public class q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        System.out.print("Answer " + ((a*a) + (b*b*b)));
    }
}
