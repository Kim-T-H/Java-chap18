package chap18;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * 1. IntStream.rangeClosed 메서드를 이용하여
   입력된 숫자까지의 합, 짝수의 합, 홀수의 합을 구하는 프로그램 작성하기
 */
public class test1 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		
			System.out.println("숫자를 입력하세요");
			int x =scan.nextInt();
			IntStream is= IntStream.rangeClosed(1, x);
			System.out.println(x+"까지의 합:"+is.sum());
			
			IntStream is2= IntStream.rangeClosed(1, x);
			System.out.println(x+"짝수 까지의 합"+is2.filter(s->s%2==0).sum());
			
			IntStream is3= IntStream.rangeClosed(1, x);
			System.out.println(x+"짝수 까지의 합"+is3.filter(s->s%2!=0).sum());
	
		
	}

}
