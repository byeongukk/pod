package com.toy.pod.member.model.vo;

import java.sql.Date;

public class MemberVO {
	private int memberNo;			//멤버 번호
	private String memberId;		//멤버 아이디
	private String memberPwd;		//멤버 비밀번호
	private String email;			//이메일
	private String emailCheck;		//이메일 인증여부
	private String memberStatus;	//멤버상태
	private Date joinDate;			//가입일
	private String emailCode;		//이메일 인증코드
	
	public MemberVO() {}
		

	public MemberVO(int memberNo, String memberId, String memberPwd, String email, String emailCheck,
			String memberStatus, Date joinDate, String emailCode) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.email = email;
		this.emailCheck = emailCheck;
		this.memberStatus = memberStatus;
		this.joinDate = joinDate;
		this.emailCode = emailCode;
	}



	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailCheck() {
		return emailCheck;
	}

	public void setEmailCheck(String emailCheck) {
		this.emailCheck = emailCheck;
	}

	public String getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getEmailCode() {
		return emailCode;
	}

	public void setEmailCode(String emailCode) {
		this.emailCode = emailCode;
	}


	@Override
	public String toString() {
		return "MemberVO [memberNo=" + memberNo + ", memberId=" + memberId + ", memberPwd=" + memberPwd + ", email="
				+ email + ", emailCheck=" + emailCheck + ", memberStatus=" + memberStatus + ", joinDate=" + joinDate
				+ ", emailCode=" + emailCode + "]";
	}
	
	
	
	
	
}
