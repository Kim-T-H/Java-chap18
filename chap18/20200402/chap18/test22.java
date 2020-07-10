package chap18;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;
/*
* 수학 점수 총점:265
*영어 점수 총점:290
*수학 점수 평균:66.25
*영어 점수 평균:72.5
*컴공학생 목록
*[name=홍길동, eng=60, math=70, major=컴공]
*[name=임꺽정, eng=85, math=65, major=컴공]
*컴공 수학 점수 총점:135
*영어 점수 총점:145
*수학 점수 평균:67.5
*영어 점수 평균:72.5
*/
class Student202 {
	 private String name;
	 private int eng;
	 private int math;
	 private String major;
	 public Student202(String name, int eng, int math, String major) {
	  this.name = name;
	  this.eng = eng;
	  this.math = math;
	  this.major = major;
	 }
	 //getter
	 public String getName() {  return name; }
	 public int getEng() {  return eng; }
	 public int getMath() {  return math; }
	 public String getMajor() {  return major; }
	 @Override
	 public String toString() {
	  return "[name=" + name + ", eng=" + eng + ", math=" + math + ", major=" + major + "]";
	 }
	}
public class test22 {

	public static void main(String[] args) {
		 List<Student202> list = Arrays.asList(
				    new Student202("홍길동",60,70,"컴공"),new Student202("김삿갓",65,55,"경영"),
				    new Student202("이몽룡",80,75,"화공"),new Student202("임꺽정",85,65,"컴공")
				  );
				 int sum=list.stream().mapToInt(p->p.getMath()).sum(); 
		 		 System.out.println("수학 점수 총점:" + sum);
		 		 sum=list.stream().mapToInt(p->p.getEng()).sum(); 
				  System.out.println("영어 점수 총점:" + sum);
				  double avg=list.stream().mapToInt(p->p.getMath()).average().getAsDouble();
				  System.out.println("수학 점수 평균:" + avg);
				  avg=list.stream().mapToInt(p->p.getEng()).average().getAsDouble();
				  System.out.println("영어 점수 평균:"+avg); 
				  System.out.println("컴공학생 목록");
				  list.stream().filter(p->p.getMajor()=="컴공").forEach(p->System.out.println(p.getName()));

				  sum=list.stream().filter(p->p.getMajor()=="컴공").mapToInt(p->p.getMath()).sum(); 
				  System.out.println("컴공 수학 점수 총점:" + sum);
				  sum=list.stream().filter(p->p.getMajor()=="컴공").mapToInt(p->p.getEng()).sum(); 
				  System.out.println("컴공 영어 점수 총점:" +sum);
				  avg=list.stream().filter(p->p.getMajor()=="컴공").mapToInt(p->p.getMath()).average().getAsDouble();
				  System.out.println("컴공 수학 점수 평균:" +avg); 
				  avg=list.stream().filter(p->p.getMajor()=="컴공").mapToInt(p->p.getEng()).average().getAsDouble();
				  System.out.println("컴공 영어 점수 평균:" + avg);

	}


}
