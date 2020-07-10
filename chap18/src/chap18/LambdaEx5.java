package chap18;
interface LambdaInterface5{
	void method();
}

class Outer{
	public int iv=10;
	void method() {
		final int iv=20;	//상수화!!!!!	
		LambdaInterface5 f5 = ()->{	//내부클래스로 인식 final이 붙어있는걸로 인식. 상수
			//iv=30;
			System.out.println("Outer.this.iv:"+Outer.this.iv);
			System.out.println("this.iv:"+this.iv);
			System.out.println("iv:"+iv);
		};
		f5.method();
	}
}

public class LambdaEx5 {
	public static void main(String[] args) {
		Outer o =new Outer();
		o.method();
	}
}
