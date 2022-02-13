package user.dao;

import java.util.ArrayList;

import user.vo.UserVO;

public interface UserMapper {
	//���� Ƚ������ ���� ������  int�� ������ void�� ������ x
	public int insertUser(UserVO vo);
	//vo arraylist hashmap ���� ����
	// ���ϴ� ������ �Ѱ� ��ü ���� �ϴ°�
	// pk�� ���� ������ �����ϱ� ����� �������� ���ü� �ֱ� ������ arraylist�� ��
	// �迭�� ����� �������̱� ������ arraylist�� �Ἥ ũ�� ������ �ϱ� ����
	// �������� ������ arraylist �� �ƴ϶� �⺻ UserVO
	public ArrayList<UserVO>selectUser();
	
	public int delectUser(int num);
	
	public ArrayList<UserVO> selectUserName(String name);
	
	public int updateUser(UserVO vo);
	
	public UserVO selectByNum(int num);
}
