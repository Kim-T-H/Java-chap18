package chap18;
/*
 * 추상메서드의 매개변수는 있고, 리턴 타입이 없는 경우.
 * 
 * (매개변수)-> {.......}
 * 매개변수의 갯수가 한개인 경우 () 생략가능
 * 
 * 실행되는 구문이 한문장인 경우 {} 생략 가능
 */

@FunctionalInterface
	interface LambdaInterface3{
	void method(int x);
}
public class LambdaEx3 {

	public static void main(String[] args) {
		LambdaInterface3 fi = (x)->{
			System.out.println(x*5);
		};
		fi.method(2);
		fi.method(10);
		
		fi = x -> System.out.println(x+x);
		fi.method(2);
		fi.method(10);
		
		//문제 calc 메서드를 이용하기	//메서드 불러오기
		
		calc(fi);	//x+x 인 함수 호출
		calc(x->System.out.println(x*x));	//x*x 인 함수 호출
	}
	static void calc(LambdaInterface3 f) {	
		f.method(10);
	}
}
