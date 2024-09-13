package edu.ict.ex.page;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 페이징 처리를 위해선 페이지 번호와 한 페이지 당
// 몇 개의 데이터를 보여줄 것인지 결정 되어야만 함.
@Setter
@Getter
@ToString
public class Criteria {

	private int pageNum; // 페이지 번호
	private int amount; // 한 페이지 당 몇 개의 데이터를 보여줄 것인가?

	public Criteria() {
		this(1, 10); // 기본 값 1페이지 10개로 지정
	}

	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
}