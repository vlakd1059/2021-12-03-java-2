import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "��° �����Է� >> ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.print("¦���� ��� >> ");
		for(int i=0;i<arr.length; i++) {
			if (arr[i] % 2 == 0) {
				int num = arr[i];
				System.out.print(num+ " ");
			}
			
		}
	
	}
}
