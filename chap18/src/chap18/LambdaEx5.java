package chap18;
interface LambdaInterface5{
	void method();
}

class Outer{
	public int iv=10;
	void method() {
		final int iv=20;	//���ȭ!!!!!	
		LambdaInterface5 f5 = ()->{	//����Ŭ������ �ν� final�� �پ��ִ°ɷ� �ν�. ���
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
