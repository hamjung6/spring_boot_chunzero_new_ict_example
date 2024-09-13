package edu.ict.ex.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*이름       널?       유형             
-------- -------- -------------- 
BID      NOT NULL NUMBER(4)      
BNAME             VARCHAR2(100)  
BTITLE            VARCHAR2(300)  
BCONTENT          VARCHAR2(1200) 
BDATE             DATE           
BHIT              NUMBER(4)      
BGROUP            NUMBER(4)      
BSTEP             NUMBER(4)      
BINDENT           NUMBER(4)*/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BoardVO {
	private int bid; // NOT NULL NUMBER(4)
	private String bname; // VARCHAR2(10)
	private String btitle; // VARCHAR2(9)
	private String bcontent; // NUMBER(4)
	private Date bdate; // DATE
	private int bhit;
	private int bgroup; // NUMBER(7,2)
	private int bstep; // NUMBER(7,2)
	private int bindent; // NUMBER(2)
}