package chap18;
/*
 * Function 인터페이스
 * 	-매개변수도 있고, 리턴 값도 있음.
 * 	-R apply...() 메서드를 가짐
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
		new Student("홍길동",90,80,"경영"),
		new Student("김삿갓",95,70,"컴공"),
		new Student("이몽룡",85,75,"통계")
	};
	public static void main(String[] args) {
//		System.out.print("학생의 이름:");
//		for(Student s:list) System.out.println(s.getName()+",");
//		System.out.println();
		System.out.print("학과의 이름:");
		for(Student s:list) System.out.println(s.getMajor()+",");
		System.out.println();
		System.out.print("학생의 이름:");
		printString(t->t.getName());
		System.out.print("학과의 이름:");
		printString(t->t.getMajor());
		System.out.print("수학 점수:");
		printString(t->t.getMath()+"");		///신기방기
		System.out.print("학생의 이름(영어 점수):");
		printString(t->t.getName()+"("+t.getEng()+")");
		System.out.print("학생의 이름(수학 점수):");
		printString(t->t.getName()+"("+t.getMath()+")");

		System.out.print("학생들의 영어 점수 합계:");
		printTot(t->t.getEng());
		System.out.print("학생들의 수학 점수 합계:");
		printTot(t->t.getMath());
		System.out.print("학생들의 총점 합계:");
		printTot(t->t.getEng()+t.getMath());
		
		System.out.print("학생들의 영어 평균:");
		printAvg(t->t.getEng());
		System.out.print("학생들의 수학 평균점수 :");
		printAvg(t->t.getMath());
		System.out.print("학생들의 총점 평균점수:");
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
			System.out.print(f.apply(s)+",");	//s 가 t로들어감.
		}
		System.out.println();
	}

	}


