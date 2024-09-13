package edu.ict.ex.service;

import java.util.List;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.BoardVO;

public interface BoardService {
	List<BoardVO> getList();
	BoardVO get(int bno);

	void remove(int bno);
	void write(String bname, String btitle, String bcontent);
	void modify(int bid, String bname, String btitle, String bcontent);

	// 댓글
	void writeReply(BoardVO board);
	int upHit(BoardVO board);
	
	//페이징
	   //페이징처리함수
	    int getTotal();
	    List<BoardVO> getListWithPaging(Criteria cri);

}
