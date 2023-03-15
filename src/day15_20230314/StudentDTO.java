package day15_20230314;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentDTO {

	private Long id;  // 관리번호
	private String studentNumber;  // 학번
	private String studentName;  // 이름
	private String studentMajor; // 전공
	private String studentMobile;  // 전화번호
// String 은 변수타입이 아닌,클래스
// String 객체타입(== 이 아닌 equals(불린타입)로 비교)
		
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentMajor() {
		return studentMajor;
	}
	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}
	public String getStudentMobile() {
		return studentMobile;
	}
	public void setStudenetMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}
	//override 상속하여 재정의
	public String toString() {
		return "StudentDTO [id=" + id + ", studentNumber=" + studentNumber + ","
				+ " studentName=" + studentName + ", studentMajor=" + studentMajor + ", studentMobile=" + studentMobile + "]";  
	}
	// 두 객체의 필드값이 모두 일치하는지 판단하려면 hashCode(), equals() 메서드를 재정의하자
	@Override
	public int hashCode() {
		return Objects.hash(id, studentMajor, studentMobile, studentName, studentNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDTO other = (StudentDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(studentMajor, other.studentMajor)
				&& Objects.equals(studentMobile, other.studentMobile) && Objects.equals(studentName, other.studentName)
				&& Objects.equals(studentNumber, other.studentNumber);
	}
	
	
}
