package day15_20230314;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
	
		Map<Integer, String> map1 = new HashMap<>();
		List<String> list1 = new ArrayList<>();
		
		map1.put(1, "안녕하세요");     // * put 주소만 저장, get 가져와서 출력
		System.out.println(map1.put(2, "hello"));  //null 출력됨
		// ㄴ 콘솔 순서 put 2번 역시 hello 저장만 해서 null
		
		System.out.println(map1.put(2, "ㅎㅎㅎㅎㅎㅎㅎ")); // hello 출력됨
		// ㄴ3. put으로 자리를 차지하고 있는 중에 추가로 put 진행시 이전에 있던 주소값을 출력 진행
		// ㄴ ㅎㅎㅎ 은 put 이므로 2번 자리에 저장만 되고, null 이었던 자리에 hello 주소값을 리턴> 출력하여 콘솔 실행
		
		System.out.println(map1.get(2));  // 가장마지막에 저장한 값을 출력
		// get 상 가장 마지막에 저장했던 값을 출력 진행하여 ㅎㅎ 콘솔 실행
		// * String java.util.Map.put(Integer key, String value)
		
		String val1 = map1.get(1);
		System.out.println(val1);     // 안녕하세요 출력
		
		//* String java.util.Map.get(Object key)
		//리턴해주는 타입을 맞춰 작성
		
		map1.remove(2);
		System.out.println(map1.get(2));   // null
	}

}
