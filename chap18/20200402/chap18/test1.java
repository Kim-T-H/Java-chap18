package chap18;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * 1. IntStream.rangeClosed �޼��带 �̿��Ͽ�
   �Էµ� ���ڱ����� ��, ¦���� ��, Ȧ���� ���� ���ϴ� ���α׷� �ۼ��ϱ�
 */
public class test1 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		
			System.out.println("���ڸ� �Է��ϼ���");
			int x =scan.nextInt();
			IntStream is= IntStream.rangeClosed(1, x);
			System.out.println(x+"������ ��:"+is.sum());
			
			IntStream is2= IntStream.rangeClosed(1, x);
			System.out.println(x+"¦�� ������ ��"+is2.filter(s->s%2==0).sum());
			
			IntStream is3= IntStream.rangeClosed(1, x);
			System.out.println(x+"¦�� ������ ��"+is3.filter(s->s%2!=0).sum());
	
		
	}

}
