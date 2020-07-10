package chap18;

import java.util.function.IntBinaryOperator;

/*
 * Operator 인터페이스
 * 		apply 계열의 추상 메서드 소유
 * 		Function 인터페이스의 하위 인터페이스임.
 * 		매개변수도 있고, 리턴값도 존재함.
 * 		매개변수들을 연산한 값은 리턴.
 */
public class LambdaEx9 {
	private static Student[] list={
		new Student("홍길동",90,80,"경영"),		//0번 인덱스
		new Student("김삿갓",95,70,"컴공"),		//1번 인덱스
		new Student("이몽룡",85,75,"통계")		//2번 인덱스
	};
	
	public static void main(String[] args) {
		System.out.print("최대 수학 점수:");
		int max =maxOrMinMath((a,b)->{
			if(a>=b) return a;
			else return b;
		});
		System.out.println(max);
		System.out.print("최소 수학 점수");
		System.out.println(maxOrMinMath((a,b)->(a<b)?a:b));
		
		
		int max1 =maxOrMinEng((a,b)->{
			if(a>=b) return a;
			else return b;
		});
		System.out.print("최대 영어 점수");
		System.out.println(max1);
		System.out.print("최소 영어 점수");
		System.out.println(maxOrMinEng((a,b)->(a<b)?a:b));
		
	}
	private static int maxOrMinEng(IntBinaryOperator op1) {
		int result= list[0].getEng();
		for (Student s : list) {
			result = op1.applyAsInt(result, s.getEng());
		}
		return result;
	}
	
	
	private static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();  //0번 인덱스 먼저 놓고
		for(Student s : list) {
			result = op.applyAsInt(result, s.getMath());  //비교하면서 결고ㅏ값 출력
		}
		return result;
	}

}
