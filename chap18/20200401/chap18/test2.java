package chap18;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

//[���]
//�̸� ��� :ȫ�浿,���,�̸���,���ڹ�,���ڹ�,
//���� ��� :10,30,15,25,20,
//�ѳ����� �ջ� :100
//������ ��� :20.0

public class test2 {
	static Person[] arr = {
			   new Person("ȫ�浿",10),
			         new Person("���",30),
			         new Person("�̸���",15),
			         new Person("���ڹ�",25),
			         new Person("���ڹ�",20)};
	public static void main(String[] args) {
		 System.out.print("�̸� ��� :");
		  printString(t->t.name);
		  System.out.print("���� ��� :");
		  printString(t->t.age+"");		//��ü�� ���ڿ��� ����� ���
		  System.out.print("�ѳ����� �ջ� :");
		  printTot(t->t.age);
		  System.out.print("������ ��� :");
		  printAvg(t->t.age);
		 }
		 static void printString(Function<Person,String> f) {
			
			 for(Person p: arr) { 
				 System.out.print(f.apply(p)+",");
			 }
			 System.out.println("");
			 
		 }
		 static void printTot(ToIntFunction<Person> f) {
			 int sum=0;
			 for(Person p: arr) {
				 sum+=f.applyAsInt(p);
			 }
			 System.out.println(sum);
		 }
		 static void printAvg(ToDoubleFunction<Person> f) {
			 double avg=0.0;
			 int sum=0;
			 for(Person p: arr) {
				 sum+=f.applyAsDouble(p);
			 }
			 avg= sum/arr.length;
				System.out.println(avg);
		 } 
	}
