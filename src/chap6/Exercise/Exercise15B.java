package chap6.Exercise;

public class Exercise15B {
	public static void main(String[] args) {
		Exercise15A memberService = new Exercise15A();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
