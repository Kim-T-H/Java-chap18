package chap18;
/*
 * Runnable 인터페이스를 이용하여 람다식으로 스레드 생성하기
 */
public class LambdaEx2 {
	public static void main(String[] args){
		System.out.println("main 시작");
		
		
		Runnable r =()-> { //이름 없는 내부 클래스(지역 내부 클래스)
			int sum =0;
			for(int i =1 ; i<=100; i++) {
				sum+=i;
			}
			System.out.println("1부터 100까지의 합:"+sum);
		};
		
		
		Thread t1 =new Thread(r);
		Thread t2 =new Thread(()-> {  
			int sum=0;
			for(int i=1; i<=100;i++) {
				sum+=i;
			}
			System.out.println("1부터 100까지의 합2:"+sum);
		});
		t1.start(); t2.start();
	}

}
