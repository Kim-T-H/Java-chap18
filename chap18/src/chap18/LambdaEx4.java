package chap18;
/*
 * 매개변수도 있고, 리턴값도 있는 경우
 * 
 */

interface LambdaInterface4{
	int method(int x, int y);
}
public class LambdaEx4 {

	public static void main(String[] args) {
		LambdaInterface4 f4= (x,y)->{
			return x*y;
		};
		System.out.println("두 수의 곱:"+ f4.method(2, 5));
		f4= (x,y)->x+y; //{return x+y;};
		System.out.println("두 수의 합:"+ f4.method(2, 5));
		f4= (x,y)->x-y;
		System.out.println("두 수의 차:"+ f4.method(5, 2));
		f4= (x,y)->x%y;
		System.out.println("두 수를 나눈 나머지:"+ f4.method(5, 2));
		f4= (x,y)->sum(x,y);
		System.out.println("두 수의 합:"+f4.method(2, 5));
		f4= (x,y)->(x>y)?x:y;	//삼항 연산식
		System.out.println("두 수 중 큰 수:"+f4.method(2, 5));
		f4= (x,y)->(x>y)?y:x;
		System.out.println("두 수 중 작은 수:"+f4.method(2, 5));
	}
	private static int sum(int x, int y) {
		return x+y;
	}

}
