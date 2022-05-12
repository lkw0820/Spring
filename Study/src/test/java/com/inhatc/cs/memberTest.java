package com.inhatc.cs;
import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.inhatc.persistence.MemberDAO;
import com.inhatc.domain.MemberVO;

//@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class memberTest {
	@Inject
	private MemberDAO dao;
	/*@Test
	public void getTime() throws Exception{
		System.out.println(dao.getTime());
	}
	@Test
	public void insertMember() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setUserid("gewonlee99");
		vo.setUserpw("1111");
		vo.setUsername("lkw");
		vo.setEmail("gewonlee99@naver.com");
		dao.insertMember(vo);
	}
	@Test
	public void readMember() throws Exception{
		System.out.println(dao.readMember("gewonlee99"));
	}
	@Test
	public void readMemberWithPw() throws Exception{
		System.out.println(dao.readMemberWitPw("gewonlee99", "1111"));
	}
	@Test
	public void updateMember() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setUserid("gewonlee99");
		vo.setUserpw("updatePw");
		vo.setUsername("updateName");
		vo.setEmail("updateEmail");
		dao.updateMember(vo);
	}
	@Test
	public void listCount() throws Exception{
		System.out.println(dao.listCount());
	}
	@Test
	public void listAll() throws Exception{
		System.out.println(dao.listAll());
	}*/
	@Test
	public void deleteMember() throws Exception{
		String userid="gewonlee99";
		dao.deleteMember(userid);
	}

}
