import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���.");
		for (int i = 0; i <arr.length; i++) {
			System.out.print((i + 1) + "���� >> ");
			arr[i] = sc.nextInt();
		}
		System.out.print("�Է��Ͻ� ���� : ");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+ " ");
			

		}
	}
}
