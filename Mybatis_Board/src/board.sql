
--게시판 글정보 테이블
create table board_tb(
	boardnum 	number			primary key
	,name	 	varchar2(20)	not null
	,title		varchar2(100)	not null
	,content	varchar2(2000)	not null
	,hits		number			default 0
	,indate
)
--게시판 글 일련번호에 사용할 시퀀스 생성


