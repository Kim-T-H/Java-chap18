package chap18;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class iopsss {

	public static void main(String[] args) {
		Map<String, String> map =new HashMap<String, String >();
		map.put("ȫ�浿", "172");
		map.put("������", "164");
		map.put("�̸���", "176");
		map.put("�Ӳ���", "183");
	Scanner scan=new Scanner(System.in);
	while(true) {
		System.out.println("Ű�� �˰���� ����� �̸��� �Է��ϼ���:(����:��)");
		String name= scan.next();
		if(name.equals("��")) break;
		if(map.get(name)==null) { 
		System.out.println("��ϵ��� ���� �̸��Դϴ�.");
		continue;
		}
	System.out.println(name+"="+map.get(name));
		
	}
	
	
	for(Entry<String, String> i:map.entrySet()) {
		System.out.println(i.getKey()+"="+i.getValue());
	}
	}
}
