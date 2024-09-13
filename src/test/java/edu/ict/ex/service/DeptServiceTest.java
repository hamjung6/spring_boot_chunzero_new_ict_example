package edu.ict.ex.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.vo.DeptVO;

@SpringBootTest
class DeptServiceTest {
	
	@Autowired
	private DeptService sevice;
	
	@Test
	void testGetList() {
		for (DeptVO vo : sevice.getList()) {
			System.out.println(vo);
		}
	}

}
