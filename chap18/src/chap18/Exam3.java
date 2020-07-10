package chap18;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

public class Exam3 {

	public static void main(String[] args) {
		IntSupplier s = () -> {
			int sum = 0;
			for (int i = 1; i <= 100; i++)
				sum += i;
			return sum;

		};

		System.out.println("1���� 100������ ��:" + s.getAsInt()); // getAsInt() ���� ����.

		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.print("arr �迭�� ����� ��:");
		Consumer<int[]> c = x -> {
			int sum = 0;
			for (int i : x) {
				sum += i;
			}
			System.out.println(sum);
		};

		c.accept(arr);
	}

}
