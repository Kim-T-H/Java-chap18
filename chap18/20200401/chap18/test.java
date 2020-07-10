package chap18;

import java.util.Comparator;
import java.util.TreeSet;

//1. Person 클래스 구현하기
//멤버 변수 : 이름, 나이
//생성자 : 구동 클래스에 맞도록
//멤버메서드 : 출력 결과에 맞도록 toString  메서드 오버라이딩 하기
//2. 구동 클래스 완성하기 다음 결과에 맞도록 구동 클래스를 완성하기.
//단  Comparator  인터페이스는 FunctionalInterface 이므로 람다식으로 처리함.
//[결과]
//이름순:[김삿갓:30, 김자바:25, 박자바:20, 이몽룡:15, 홍길동:10]
//나이순:[홍길동:10, 이몽룡:15, 박자바:20, 김자바:25, 김삿갓:30]
//이름 역순:[홍길동:10, 이몽룡:15, 박자바:20, 김자바:25, 김삿갓:30]
//나이 역순:[김삿갓:30, 김자바:25, 박자바:20, 이몽룡:15, 홍길동:10]

class Person implements Comparable{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+":"+age;
	}
	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		return name.compareTo(p.name);
	}
}

public class test {

	public static void main(String[] args) {
		Person[] arr = 
			{ new Person("홍길동", 10), new Person("김삿갓", 30), 
				new Person("이몽룡", 15), new Person("김자바", 25),new Person("박자바", 20) };
		TreeSet<Person> s1 = new TreeSet<Person>((p1,p2)->p1.compareTo(p2));
		for (Person p : arr)
		s1.add(p);
		System.out.print("이름순:");
		System.out.println(s1);
		
		TreeSet<Person> s2 = new TreeSet<Person>((p1,p2)->p1.age-p2.age);
		for (Person p : arr)
		s2.add(p);
		System.out.print("나이순:");
		System.out.println(s2);
		
		TreeSet<Person> s3 = new TreeSet<Person>((p1,p2)->p1.compareTo(p2)*(-1));
		for (Person p : arr)
		s3.add(p);
		System.out.print("이름 역순:");
		System.out.println(s3);
		
		TreeSet<Person> s4 = new TreeSet<Person>((p1,p2)->p2.age-p1.age);
		for (Person p : arr)
		s4.add(p);
		System.out.print("나이 역순:");
		System.out.println(s4);
	}
}
//class AgeDesc implements Comparator<Person>{		//나이 내림차순
//	public int compare(Person p1, Person p2) {
//		return p1.age-p2.age;
//	}
//}
//class NameDesc implements Comparator<Person>{		//이름 역순
//	public int compare(Person p1, Person p2) {
//		return p1.compareTo(p2)*(-1);
//	}
//}
