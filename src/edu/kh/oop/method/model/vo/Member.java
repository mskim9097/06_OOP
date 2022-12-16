package edu.kh.oop.method.model.vo;

public class Member {
	
	//필드
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	
	//생성자
	// 기본 생성자
	// 기본생성자 규칙: 반환형이 없고, 클래스와 이름이 같아야한다.
	public Member() {}
	
	// 매개변수 생성자
	public Member(String memberId, String memberPw, 
			String memberName, int memberAge) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}
	
	
	//메서드
	public String getMemberId() {
				// get + 필드명 (카멜케이스적용)
		return memberId;
	}
	
	// 매개변수로 전달받은 값을 memberId 필드에 대입
	// (매개변수 == 전달 받은 값을 지니고 있는 변수)
	public void setMemberId(String memberId) {
				// set + 필드명 (카멜케이스적용)
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
	
	


}
