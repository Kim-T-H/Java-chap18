package chap18;

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

/*
 * IntPredicate 인터페이스를 이용하여
 * 단 배열에 저장된 10개의 숫자는 1부터 100까지의 임의의 수로 채우기.
 */
public class Exam5 {
	private static int[]arr = new int[10];
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
		 arr[i]=(int)(Math.random()*100)+1;
		 System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("arr 배열의 짝수 중 최대 숫자:"+maxOrMin(t->t%2==0,(a,b)->(a>b)?a:b));
		System.out.println("arr 배열의 짝수 중 최소 숫자:"+maxOrMin(t->t%2==0,(a,b)->(a<b)?a:b));
		System.out.println("arr 배열의 홀수 중 최대 숫자:"+maxOrMin(t->t%2==1,(a,b)->(a>b)?a:b));
		System.out.println("arr 배열의 홀수 중 최소 숫자:"+maxOrMin(t->t%2==1,(a,b)->(a<b)?a:b));
		System.out.println("arr 배열의 최대 숫자:"+maxOrMin(t->true,(a,b)->(a>b)?a:b));
		System.out.println("arr 배열의 최소 숫자:"+maxOrMin(t->true,(a,b)->(a<b)?a:b));

	}
	private static int maxOrMin(IntPredicate p, IntBinaryOperator o) {
		int result=arr[0];				//비교
		for(int i : arr) {
			if(p.test(i)){ 
				result=o.applyAsInt(result, i);
			}
		}
		
		
		return result;
	}
}
