package day15_20230314_2;

import java.util.HashMap;
import java.util.Map;

//풋으로 넣고 겟으로 가져오기
public class BoardRepository {
	Map<String, BoardDTO> bMap = new HashMap<>();

	public boolean save(BoardDTO boardDTO) {
		if (bMap.put(boardDTO.getBno(), boardDTO) == null) {
			return true;
		}
		return false;
	}    //// ㄴ put으로 null 이 뜬 경우자체가 입력이 잘된 경우로 true로 리턴

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
	
	
	public  boolean delete(String bno) {
		for(String b : bMap.keySet()) {	
			if(bMap.get(b).getBno().equals(bno)) {
				bMap.remove(b);
				
				return true;
			}
		}
		return false;
	}
	


	public boolean update(boardDTO, String bno) {
		for(String b : bMap.keySet()) {
			if(bMap.get(b).getBno().equals(bno)) {
				b.setTitle(b.getTitle());
				b.setWriter(b.getWriter());
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
	
	
	
	
	
	
	
}


