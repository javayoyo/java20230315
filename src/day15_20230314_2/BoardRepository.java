package day15_20230314_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//풋으로 넣고 겟으로 가져오기
public class BoardRepository {

	Map<String, BoardDTO> bMap = new HashMap<>();

	public boolean save(BoardDTO boardDTO) {
		if (bMap.put(boardDTO.getBno(), boardDTO) == null) {
			return true;
		}
		return false;
	} //// ㄴ put으로 null 이 뜬 경우자체가 입력이 잘된 경우로 true로 리턴

	
	
	public Map<String, BoardDTO> findAll() {
		return bMap;
	}

	public BoardDTO findById(String bno) {
		for (String b : bMap.keySet()) {
			// 키값을 가져와서 b에서 반복한다

			if (bMap.get(b).getBno().equals(bno)) {
				// bmap의 키값인 b와 입력받은 bno

				return bMap.get(b);
				// 키값에 벨류값
			}
		}
		return null;
	}

	public boolean update(BoardDTO boardDTO, String bno) {
		for (String b : bMap.keySet()) {
			if (bMap.get(b).getBno().equals(bno)) {
				bMap.get(b).setTitle(boardDTO.getTitle());
				bMap.get(b).setWriter(boardDTO.getWriter());
				return true;
			}
		}
		return false;
	}

//	public boolean update(BoardDTO boardDTO, String bno) {
//		for(BoardDTO b : list) {
//			if(b.getBno().equals(bno)) {
//				b.setTitle(boardDTO.getTitle());
//				b.setWriter(boardDTO.getWriter());
//				return true;
//			}
//		}
//		return false;
//	}	

	public boolean delete(String bno) {
		for (String b : bMap.keySet()) {
			if (bMap.get(b).getBno().equals(bno)) {
				bMap.remove(b);

				return true;
			}
		}
		return false;
	}

//	public boolean updateNew(String bno, String updateTitle,
//			String updateWriter) {
//		
//		for(BoardDTO b : list) {	
//			if(b.getBno().equals(bno)) {
//				b.setTitle(updateTitle);
//				b.setWriter(updateWriter);
//				
//				return true;
//			}
//		}
//		return false;
//	
//	}

	public List<BoardDTO> search(String writer) {
		// 검색결과를 담을 리스트 선언
		List<BoardDTO> list = new ArrayList<>();
		for (String b : bMap.keySet()) {
			if (bMap.get(b).getWriter().equals(writer)) {
				list.add(bMap.get(b));
				// ㄴ BoardDTO result = bMap.get(b);
				// ㄴlist.add(result); 가능
				
			}   //return의 경우, > 찾는 순간 바로 리턴하기때문에, 
		}       // 모든 결과를 본 후 리턴해야해서 for문 밖에서 리턴
		return list;
	}

}
