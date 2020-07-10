package chap18;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class iopsss {

	public static void main(String[] args) {
		Map<String, String> map =new HashMap<String, String >();
		map.put("홍길동", "172");
		map.put("성춘향", "164");
		map.put("이몽룡", "176");
		map.put("임꺽정", "183");
	Scanner scan=new Scanner(System.in);
	while(true) {
		System.out.println("키를 알고싶은 사람의 이름을 입력하세요:(종료:끝)");
		String name= scan.next();
		if(name.equals("끝")) break;
		if(map.get(name)==null) { 
		System.out.println("등록되지 않은 이름입니다.");
		continue;
		}
	System.out.println(name+"="+map.get(name));
		
	}
	
	
	for(Entry<String, String> i:map.entrySet()) {
		System.out.println(i.getKey()+"="+i.getValue());
	}
	}
}
