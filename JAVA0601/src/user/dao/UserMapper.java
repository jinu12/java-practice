package user.dao;

import java.util.ArrayList;

import user.vo.UserVO;

public interface UserMapper {
	//실행 횟수값을 얻을 수있음  int을 넣으면 void를 넣으면 x
	public int insertUser(UserVO vo);
	//vo arraylist hashmap 많이 사용됨
	// 원하는 데이터 한개 전체 조인 하는거
	// pk에 대한 조건이 없으니까 결과가 여러개가 나올수 있기 때문에 arraylist로 씀
	// 배열은 사이즈가 고정적이기 떄문에 arraylist를 써서 크기 조절을 하기 위해
	// 조건절이 있으면 arraylist 가 아니라 기본 UserVO
	public ArrayList<UserVO>selectUser();
	
	public int delectUser(int num);
	
	public ArrayList<UserVO> selectUserName(String name);
	
	public int updateUser(UserVO vo);
	
	public UserVO selectByNum(int num);
}
