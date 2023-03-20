package day15_20230314_2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BoardDTO {
	private static int number = 100;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	
	private String bno;
	private String title;
	private String writer;
	private int cnt;
	private String postDate;
	
	public BoardDTO() {
		this.bno = "B"+number++;
		this.postDate = DTF.format(LocalDateTime.now());
	}
	public BoardDTO(String updateTitle, String updateWriter) {
		this.title = updateTitle;
		this.writer = updateWriter;
	}
	public String getBno() {
		return bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getCnt() {
		return cnt;
	}
	public void increaseCnt() {
		this.cnt++;
	}
	public String getPostDate() {
		return postDate;
	}
	public void print() {
		System.out.printf("%s\t%s\t%s\t%d\t%s\n",bno,title,writer,cnt,postDate);
	}

	@Override
	public String toString() {
		return "BoardDTO [bno=" + bno + ", title=" + title + ", writer=" + writer + ","
				+ "cnt=" + cnt + ", postDate="+ postDate + "]";
	}

}
