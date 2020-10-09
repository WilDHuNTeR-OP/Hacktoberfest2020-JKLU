package assn2;
import java.util.Scanner;
public class q8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String num1 = String.valueOf(num);
		int arr[] = new int[num1.length()];
		for(int i=0; i<num1.length(); i++) {
			arr[i] = Integer.parseInt(String.valueOf(num1.charAt(i)));
	}
		int max = Integer.parseInt(String.valueOf(num1.charAt(0)));
		for(int i=0; i<num1.length(); i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		String str = "";
		for(int i=0; i<num1.length(); i++) {
			if (arr[i]!=max) {
				str+=arr[i];
			}
		}
		System.out.println(str);
}
	}
