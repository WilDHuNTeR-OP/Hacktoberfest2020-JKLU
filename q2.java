package assn2;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			int num=input.nextInt();
			sum+=num;
		}
		System.out.println(sum);

	}

}
