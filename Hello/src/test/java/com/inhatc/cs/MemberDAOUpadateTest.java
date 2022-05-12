package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.MemberVO;
import com.inhatc.persistence.MemberDAO;

//@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class MemberDAOUpadateTest{
	@Inject
	private MemberDAO dao;
	@Test
	public void testUpdateMember() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setUserid("user0"); 
		vo.setUserpw("update 0000");
		vo.setUsername("update ¾Æ¹«°³"); 
		vo.setEmail("update abc@inhatc.ac.kr"); 
		dao.updateMember(vo);
		
	}
	
}
