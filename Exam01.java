import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 정수입력 >> ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.print("짝수만 출력 >> ");
		for(int i=0;i<arr.length; i++) {
			if (arr[i] % 2 == 0) {
				int num = arr[i];
				System.out.print(num+ " ");
			}
			
		}
	
	}
}
