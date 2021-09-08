package chap6.Exercise;

public class Exercise15A {
	//작성 위치
	String id;
	String password;
	//final String을 쓰고 싶은데 초기값 설정 때문에 에러가 난다. 왤까.
	
	boolean login(String id, String password) {
		this.id = id;
		this.password=password;
		return id.equals("hong") && password.equals("12345");
	}
	
	void logout(String id){
		System.out.println("로그아웃 되었습니다.");
	}

}
