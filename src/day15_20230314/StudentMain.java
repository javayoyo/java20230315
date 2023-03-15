package day15_20230314;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 학생정보를 관리할 Map
		Map<Long, StudentDTO> studentMap = new HashMap<>();
		
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setId(1L);
		studentDTO.setStudentNumber("1111");
		studentDTO.setStudentName("김자바");
		studentDTO.setStudentMajor("컴퓨터공학");
		studentDTO.setStudenetMobile("010-1111-1111");
		
		studentMap.put(studentDTO.getId(), studentDTO);
		
		
		StudentDTO studentDTO1 = new StudentDTO();
		studentDTO1.setId(2L);
		studentDTO1.setStudentNumber("2222");
		studentDTO1.setStudentName("이바자");
		studentDTO1.setStudentMajor("경영학");
		studentDTO1.setStudenetMobile("010-2222-2222");
		
		studentMap.put(studentDTO1.getId(), studentDTO1);
		//만약 똑같이 DTO,DTO2 가 입력된 값이 같다해도 equals 상 주소는 false
		// DTO에 hashcode,equals 소스 입력시, true
		//ㄴ(두가지의 값을 비교할때, 하나씩 각가 비교 필요하여 해당 코딩 진행)
		
		
		
		// 반복문으로 출력
		for(Long id : studentMap.keySet()) {
			System.out.println(id);
			System.out.println(studentMap.get(id));
			// 학생의 이름만
			System.out.println(studentMap.get(id).getStudentName());
		}
		
	}

}
