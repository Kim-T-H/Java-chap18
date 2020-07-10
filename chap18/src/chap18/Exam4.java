package chap18;

import java.util.function.IntBinaryOperator;

/*
 * IntBinaryOperator �������̽��� �̿��Ͽ�
 * �迭�� ����� �ִ���ڿ� �ּ� ���ڸ� ����ϱ�
 * �� �迭�� ����� 10���Ǽ��ڴ� 1���� 100������ ������ ���� ä���.
 */
public class Exam4 {
	private static int[] arr = new int[10];

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {		//�迭�� �ִ´� // ������ for���� 0�� �����ͼ� �ִ´�.
			arr[i] = ((int) (Math.random() * 100)) + 1;
			System.out.println(arr[i]);
		}

		int max = maxOrMin((a, b) -> {
			if (a > b)
				return a;
			else
				return b;
		});
		System.out.print("�ִ� ����:");
		System.out.println(max);
		System.out.print("�ּ� ����:");
		System.out.println(maxOrMin((a, b) -> (a < b) ? a : b));

	}

	private static int maxOrMin(IntBinaryOperator op) {
		int result = arr[0];
		for (int i : arr) {
			result = op.applyAsInt(result, i);
		}
		return result;
	}

}



