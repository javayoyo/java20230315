package day15_20230314_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BoardService {
	BoardRepository br = new BoardRepository();
	Scanner sc = new Scanner(System.in);
	
	public void save() {
		BoardDTO boardDTO = new BoardDTO();   //boardDTO 객체 생성
		System.out.print("제목> ");
		boardDTO.setTitle(sc.nextLine());  //boardDTO 호출 시,
		System.out.print("작성자> ");
		boardDTO.setWriter(sc.next());
		sc.nextLine();
		boolean success = br.save(boardDTO);
		if(success) {
			System.out.println("게시글 등록완료!");
		}else {
			System.out.println("게시글 등록실패ㅜ");
		}
	}
	//리스트 삭제 후, for 문으로 변경 전부..
	
	public void findAll() {
		Map<String, BoardDTO> boardMap = br.findAll();	// findAll 을 boardMap에 객체 저장
		for(String bno : boardMap.keySet()) {
			System.out.println(boardMap.get(bno));
		}
		
	}
	public void findById() {
		System.out.print("읽을 글번호> ");
		String bno = sc.next();
		BoardDTO b = br.findById(bno);
		if (b == null) {
			System.out.println("찾을 수 없는 글입니다");
		} else {
			b.increaseCnt();
			System.out.println(b);
		}
	}

	
	public void update() {
		System.out.print("수정할 글번호> ");
		String bno = sc.next();sc.nextLine();
		BoardDTO b = br.findById(bno);
		if(b == null) {
			System.out.println("조회할 수 없는 글번호 입니다");
		}else {
			BoardDTO boardDTO = new BoardDTO();
			System.out.print("수정할 제목> ");
			boardDTO.setTitle(sc.nextLine());
			System.out.print("수정할 작성자> ");
			boardDTO.setWriter(sc.next());
			sc.nextLine();
			if(br.update(boardDTO, bno)) {
				System.out.println("업데이트 성공");
			}else {
				System.out.println("업데이트 실패");
			}
		}
	}
	
	
	
	public void delete() {
		System.out.print("삭제할 글번호> ");
		String bno = sc.next();sc.nextLine();
		if(br.delete(bno)) {
			System.out.println("삭제완료");
		}else {
			System.out.println("삭제실패");
		}
	}
	
	
}






