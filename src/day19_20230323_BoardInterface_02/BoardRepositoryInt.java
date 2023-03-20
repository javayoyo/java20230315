package day19_20230323_BoardInterface_02;

import java.util.Map;

public interface BoardRepositoryInt {
	public boolean save(BoardDTO boardDTO);
	
	public Object findAll();    // Object 기본적으로 상속받는 최상위 객체
	
	public BoardDTO findById(String bno);
	
	public boolean update(BoardDTO boardDTO, String bno);
	
	public boolean delete(String bno);	
}
