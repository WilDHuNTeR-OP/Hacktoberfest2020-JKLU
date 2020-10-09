package assn2;

import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
		for(int i=0; i<n; i++) {
			int num = input.nextInt();
			int first = Integer.parseInt(String.valueOf((String.valueOf(num)).charAt(0)));
			sum+=first;
		}
		System.out.println(sum);
	}

}
