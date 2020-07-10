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

		System.out.println("1부터 100까지의 합:" + s.getAsInt()); // getAsInt() 값을 리턴.

		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.print("arr 배열의 요소의 합:");
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
