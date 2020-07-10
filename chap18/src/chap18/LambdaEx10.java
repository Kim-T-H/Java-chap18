package chap18;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Predicate �������̽�
 * 	�Ű����� ����. ���ϰ��� boolean ���� test() �޼��� ����� ����.
 */
public class LambdaEx10 {
	private static List<Student> list =Arrays.asList
		   (new Student("ȫ�浿",55,60,"�İ�"),
			new Student("�̸���",95,90,"�濵"),
			new Student("���",75,80,"�ɸ�"),
			new Student("�Ӳ���",65,70,"����"),
			new Student("������",65,10,"�İ�")
			);
	public static void main(String[] args) {
		System.out.println("���� ������ 60�� �̻��� �л��� ���� ���:"
				+avgEng(t->t.getEng()>=60));
		System.out.println("�İ��� ���� �л��� ���� ���:"+avgEng(t->t.getMajor()=="�İ�"));
		System.out.println("�İ����� �ƴ� �л��� ���� ���:"+avgEng(t->t.getMajor()!="�İ�"));
		System.out.println("�İ��� �л��� �̸�:"+ nameList(t->t.getMajor()=="�İ�"));
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
