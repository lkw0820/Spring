package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.MemberVO;

public interface MemberDAO {
	public String getTime();
	public void insertMember(MemberVO vo);
	public MemberVO readMember(String userid);
	public MemberVO readMemberWitPw(String userid, String userpw);
	public void updateMember(MemberVO vo); 
	public int listCount();
	public List<MemberVO> listAll();
	public void deleteMember(String userid);

}