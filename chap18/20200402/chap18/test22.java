package chap18;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;
/*
* ���� ���� ����:265
*���� ���� ����:290
*���� ���� ���:66.25
*���� ���� ���:72.5
*�İ��л� ���
*[name=ȫ�浿, eng=60, math=70, major=�İ�]
*[name=�Ӳ���, eng=85, math=65, major=�İ�]
*�İ� ���� ���� ����:135
*���� ���� ����:145
*���� ���� ���:67.5
*���� ���� ���:72.5
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
				    new Student202("ȫ�浿",60,70,"�İ�"),new Student202("���",65,55,"�濵"),
				    new Student202("�̸���",80,75,"ȭ��"),new Student202("�Ӳ���",85,65,"�İ�")
				  );
				 int sum=list.stream().mapToInt(p->p.getMath()).sum(); 
		 		 System.out.println("���� ���� ����:" + sum);
		 		 sum=list.stream().mapToInt(p->p.getEng()).sum(); 
				  System.out.println("���� ���� ����:" + sum);
				  double avg=list.stream().mapToInt(p->p.getMath()).average().getAsDouble();
				  System.out.println("���� ���� ���:" + avg);
				  avg=list.stream().mapToInt(p->p.getEng()).average().getAsDouble();
				  System.out.println("���� ���� ���:"+avg); 
				  System.out.println("�İ��л� ���");
				  list.stream().filter(p->p.getMajor()=="�İ�").forEach(p->System.out.println(p.getName()));

				  sum=list.stream().filter(p->p.getMajor()=="�İ�").mapToInt(p->p.getMath()).sum(); 
				  System.out.println("�İ� ���� ���� ����:" + sum);
				  sum=list.stream().filter(p->p.getMajor()=="�İ�").mapToInt(p->p.getEng()).sum(); 
				  System.out.println("�İ� ���� ���� ����:" +sum);
				  avg=list.stream().filter(p->p.getMajor()=="�İ�").mapToInt(p->p.getMath()).average().getAsDouble();
				  System.out.println("�İ� ���� ���� ���:" +avg); 
				  avg=list.stream().filter(p->p.getMajor()=="�İ�").mapToInt(p->p.getEng()).average().getAsDouble();
				  System.out.println("�İ� ���� ���� ���:" + avg);

	}


}
