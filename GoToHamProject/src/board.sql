
--�Խ��� ������ ���̺�
create table board_tb(
	boardnum	number			primary key
	,name		varchar2(20)	not null
	,title		varchar2(100)	not null
	,content	varchar2(2000)	not null
	,hits		number			default 0
	,indate		date			default sysdate
)
--�Խ��� �� �Ϸù�ȣ�� ����� ������ ����
create sequence board_tb_seq;

