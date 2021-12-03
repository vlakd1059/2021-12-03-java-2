import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {

			System.out.print("정수 입력 >>");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " >> ");

			for (int j = 1; j <= arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
