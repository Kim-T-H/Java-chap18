package chap18;
/*
 * Function �������̽�
 * 	-�Ű������� �ְ�, ���� ���� ����.
 * 	-R apply...() �޼��带 ����
 * 
 * Function<T,R> R apply(T)
 * ToIntFunction<T> int applyAsInt(T)
 * ToDoubleFunction<T>	double applyAsDouble(T)
 * ...
 *
 */

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

class Student{
	private String name;
	private int eng;
	private int math;
	private String major;
	public Student(String name, int eng, int math, String major) {
		super();
		this.name=name;
		this.eng=eng;
		this.math=math;
		this.major=major;
	}
	public String getName() {return name;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	public String getMajor() {return major;}
}
public class LambdaEx8 {

	
	private static Student[] list= {
		new Student("ȫ�浿",90,80,"�濵"),
		new Student("���",95,70,"�İ�"),
		new Student("�̸���",85,75,"���")
	};
	public static void main(String[] args) {
//		System.out.print("�л��� �̸�:");
//		for(Student s:list) System.out.println(s.getName()+",");
//		System.out.println();
		System.out.print("�а��� �̸�:");
		for(Student s:list) System.out.println(s.getMajor()+",");
		System.out.println();
		System.out.print("�л��� �̸�:");
		printString(t->t.getName());
		System.out.print("�а��� �̸�:");
		printString(t->t.getMajor());
		System.out.print("���� ����:");
		printString(t->t.getMath()+"");		///�ű���
		System.out.print("�л��� �̸�(���� ����):");
		printString(t->t.getName()+"("+t.getEng()+")");
		System.out.print("�л��� �̸�(���� ����):");
		printString(t->t.getName()+"("+t.getMath()+")");

		System.out.print("�л����� ���� ���� �հ�:");
		printTot(t->t.getEng());
		System.out.print("�л����� ���� ���� �հ�:");
		printTot(t->t.getMath());
		System.out.print("�л����� ���� �հ�:");
		printTot(t->t.getEng()+t.getMath());
		
		System.out.print("�л����� ���� ���:");
		printAvg(t->t.getEng());
		System.out.print("�л����� ���� ������� :");
		printAvg(t->t.getMath());
		System.out.print("�л����� ���� �������:");
		printAvg(t->t.getEng()+t.getMath());
		
		
	}
	private static void printAvg(ToDoubleFunction<Student> f) {
		double avg=0.0;
		int sum=0;
		for(Student s : list) {
			sum+=f.applyAsDouble(s);
		}
		avg= sum/list.length;
		System.out.println(avg);
		
	}
	
	private static void printTot(ToIntFunction<Student> f){
		int sum = 0;
		for(Student s:list) {
				sum+= f.applyAsInt(s);
		}
		System.out.println(sum);
	}
	private static void printString(Function<Student, String> f) {
		for(Student s: list) {
			System.out.print(f.apply(s)+",");	//s �� t�ε�.
		}
		System.out.println();
	}

	}


