package chap18;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

/*
 * Consumer �������̽�
 * 	-java Api �� �Լ��� �������̽�
 * 	-�Ű������� �ְ�, ���ϰ��� ���� �޼���(accept)�� ����.
 */
public class LambdaEx6 {

	public static void main(String[] args) {
		//accept(String s);
		//t: String ��
		Consumer<String> c1 = t->System.out.println(t+8);
		c1.accept("Java");	//Java8
		Consumer<Integer> c11 = t->System.out.println(t+8);
		c11.accept(100);	//Java8
		
		BiConsumer<String, String> c2 = (t,u)->System.out.println(t+u);//�Ű������� �ΰ� accept(T t,U u)
		c2.accept("Java", "8.0 ����");
		
		DoubleConsumer c3 = d->System.out.println("java"+d); //�Ű����� Ÿ���� double��    accept(double d)
		c3.accept(8);
		
		//�Ű����� �ΰ� (��ü, int)
		//accept(T t,int i)
		ObjIntConsumer<String> c4 = (t,i)->System.out.println(t+i); 
		c4.accept("Java", 8);
		
		//int �Ű����� �Ѱ�(int)		//	accept(int i)
		IntConsumer c5= x->{
			int sum=0;
			for(int i=1; i<=x;i++) sum+=i;
			System.out.println("1����"+x+"������ ��:"+sum);
		};
		c5.accept(10);
		c5.accept(100);
	}

}
