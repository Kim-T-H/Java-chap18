package chap18;
/*
 * ���ٽ� ����: jdk8.0 ���ĺ��� ��밡��
 * 		���ٽĿ��� ����� �� �ִ� �������̽��� �ݵ�� FunctionalInterface ������
 * FunctionalInterface : ����� �߻�޼��尡 �Ѱ��� �����ϴ� �������̽�  ex)RunnableInterface
 * 
 * �߻�޼����� �Ű������� ����, ����Ÿ�Ե� ���� ���.
 * ()->{....}
 * ���ٽ� ���ο� ����Ǵ� ������ �Ѱ��� ��� {} ���� ������.
 */
@FunctionalInterface	//������̼�
interface LambdaInterface1{
	void method();
}
public class LambdaEx1 {

	public static void main(String[] args) {
		// ���� ��� �ڵ�
		LambdaInterface1 fi= new LambdaInterface1() {	//�̸����� ����Ŭ����
			@Override
			public void method() {
				System.out.println("���� ������� �ڵ�");
			}
		};
		fi.method();
		
		
		fi = ()->{
			String str ="method call1";
			System.out.println(str);
		};
		fi.method();
		fi = ()->{
			System.out.println("method call2");
		};
		fi.method();
		
		fi = ()->System.out.println("method call3");
		fi.method();
		execute(() ->System.out.println("method call4"));
		execute(() ->System.out.println("method call4"));
	}
	static void execute(LambdaInterface1 f) {
		f.method();
	}

}
