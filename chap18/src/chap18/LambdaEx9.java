package chap18;

import java.util.function.IntBinaryOperator;

/*
 * Operator �������̽�
 * 		apply �迭�� �߻� �޼��� ����
 * 		Function �������̽��� ���� �������̽���.
 * 		�Ű������� �ְ�, ���ϰ��� ������.
 * 		�Ű��������� ������ ���� ����.
 */
public class LambdaEx9 {
	private static Student[] list={
		new Student("ȫ�浿",90,80,"�濵"),		//0�� �ε���
		new Student("���",95,70,"�İ�"),		//1�� �ε���
		new Student("�̸���",85,75,"���")		//2�� �ε���
	};
	
	public static void main(String[] args) {
		System.out.print("�ִ� ���� ����:");
		int max =maxOrMinMath((a,b)->{
			if(a>=b) return a;
			else return b;
		});
		System.out.println(max);
		System.out.print("�ּ� ���� ����");
		System.out.println(maxOrMinMath((a,b)->(a<b)?a:b));
		
		
		int max1 =maxOrMinEng((a,b)->{
			if(a>=b) return a;
			else return b;
		});
		System.out.print("�ִ� ���� ����");
		System.out.println(max1);
		System.out.print("�ּ� ���� ����");
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
		int result = list[0].getMath();  //0�� �ε��� ���� ����
		for(Student s : list) {
			result = op.applyAsInt(result, s.getMath());  //���ϸ鼭 ����� ���
		}
		return result;
	}

}
