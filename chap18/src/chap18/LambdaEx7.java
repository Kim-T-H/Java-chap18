package chap18;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 * Supplier 인터페이스
 * 	매개변수는 없고, 리턴값은 존재함.
 * 	T getXXX() 메서드를 추상 메서드로 가짐.
 * 
 */
public class LambdaEx7 {

	public static void main(String[] args) {
//		Supplier<String> s1= ()->{
//			return "java";
//		};
		Supplier<String> s1= ()->"java";
		System.out.println(s1.get());
		
		//주사위의 임의의 번호를 리턴.
//		IntSupplier s2=()->{
//			int num = (int)(Math.random()*6)+1;
//			return num;
//		};
		IntSupplier s2=()->(int)(Math.random()*6)+1;
		System.out.println(s2.getAsInt());
	}

}
