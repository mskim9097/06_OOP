package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;

public class MemberRun {
	
//	[접근제한자] [예약어] 번환형 메서드명([매개변수])
	public static void main(String[] args) {
		MemberService service = new MemberService();
		// MemberService의 기본 생성자가 작성되어 있지는 않지만
		// 문제없이 사용 가능 ! (컴파일러가 자동으로 생성)
		
		// !!! 주의할 점. !!!
		// 생성자가 하나라도 있으면 기본생성자 자동 생성 안해준다!!!
		service.displayMenu();
	}

}
