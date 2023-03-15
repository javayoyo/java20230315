package day15_20230314;

import java.util.*;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map2 = new HashMap<>();
		map2.put("첫번째", "java");
		map2.put("두번째", "mysql");
		map2.put("세번째", "spring");
		
		System.out.println(map2.get("두번째"));	
		map2.remove("세번째");
		
		// map 반복문으로 접근
		for(String key : map2.keySet()) {  //key에 해당하는 타입의 반복문 진행
		System.out.println(key);   //key 값 확인
		System.out.println(map2.get(key));    // value 값 확인
		
		//		for(int key: map1.keySet()) { // map1의 경우에서 사용해본다면..
//			System.out.println(key);
//			System.out.println(map1.get(key));
//		
//		
//		}
		
		}
		
		}

}
