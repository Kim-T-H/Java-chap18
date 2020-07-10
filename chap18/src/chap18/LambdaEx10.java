package chap18;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Predicate 인터페이스
 * 	매개변수 존재. 리턴값은 boolean 형인 test() 메서드 멤버로 가짐.
 */
public class LambdaEx10 {
	private static List<Student> list =Arrays.asList
		   (new Student("홍길동",55,60,"컴공"),
			new Student("이몽룡",95,90,"경영"),
			new Student("김삿갓",75,80,"심리"),
			new Student("임꺽정",65,70,"전자"),
			new Student("성춘향",65,10,"컴공")
			);
	public static void main(String[] args) {
		System.out.println("영어 점수가 60점 이상인 학생의 영어 평균:"
				+avgEng(t->t.getEng()>=60));
		System.out.println("컴공과 영어 학생의 영어 평균:"+avgEng(t->t.getMajor()=="컴공"));
		System.out.println("컴공과가 아닌 학생의 영어 평균:"+avgEng(t->t.getMajor()!="컴공"));
		System.out.println("컴공과 학생의 이름:"+ nameList(t->t.getMajor()=="컴공"));
	}
	private static double avgEng(Predicate<Student> pr) {
		int count=0, sum=0;
		for(Student s : list) {
			if(pr.test(s)) {
				count++;
				sum+=s.getEng();
			}
		}
		return (double)sum/count;
	}
	private static String nameList(Predicate<Student> na) {
	String name="";
		for(Student s : list) {
			if(na.test(s)) {
				name +=s.getName()+",";
			}
		}
		return name;
	}

}
