package chap18;

import java.util.function.IntBinaryOperator;

/*
 * IntBinaryOperator 인터페이스를 이용하여
 * 배열에 저장된 최대숫자와 최소 숫자를 출력하기
 * 단 배열에 저장된 10개의숫자는 1부터 100까지의 임의의 수로 채우기.
 */
public class Exam4 {
	private static int[] arr = new int[10];

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {		//배열에 넣는다 // 개선된 for문은 0을 가져와서 넣는다.
			arr[i] = ((int) (Math.random() * 100)) + 1;
			System.out.println(arr[i]);
		}

		int max = maxOrMin((a, b) -> {
			if (a > b)
				return a;
			else
				return b;
		});
		System.out.print("최대 숫자:");
		System.out.println(max);
		System.out.print("최소 숫자:");
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



