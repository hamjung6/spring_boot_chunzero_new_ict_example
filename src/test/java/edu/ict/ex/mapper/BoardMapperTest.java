package edu.ict.ex.mapper;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class BoardMapperTest {

	@Autowired
	private BoardMapper boardMapper;

	@Disabled
	@Test
	void testGetList() {
		System.out.println(boardMapper.getList());

		for (BoardVO vo : boardMapper.getList()) {
			System.out.println(vo);
		}
	}

	@Disabled
	@Test
	void testRead() {
		System.out.println(boardMapper.read(29));
	}

	@Disabled
	@Test
	void testDelete() {

		int count = boardMapper.delete(29);

		System.out.println("삭제된 갯수" + count);

		if (boardMapper.read(29) == null) {
			System.out.println("제대로 삭제되었음");
		}
	}

	@Disabled
	@Test
	void testWrite() {

		int count = boardMapper.write("윤다영", "다제로", "르느ㅟㅐㅇㅀ");

		System.out.println("추가된 갯수" + count);
	}
	
	@Disabled
	@Test
	void testModify() {

		int count = boardMapper.modify(22, "바보", "멍청이", "메롱");

		System.out.println("수정된 갯수" + count);
	}
	
	@Test
	void testGetListWithPaging() {

		Criteria criteria = new Criteria();
		
		criteria.setAmount(10);
		criteria.setPageNum(3);
		
		List<BoardVO> list = boardMapper.getListWithPaging(criteria);
		System.out.println(list);
	}
}
