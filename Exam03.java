import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요.");
		for (int i = 0; i <arr.length; i++) {
			System.out.print((i + 1) + "번답 >> ");
			arr[i] = sc.nextInt();
		}
		System.out.print("입력하신 답은 : ");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+ " ");
			

		}
	}
}
