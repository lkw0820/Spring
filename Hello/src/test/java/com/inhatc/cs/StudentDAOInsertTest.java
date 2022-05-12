package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.StudentVO;
import com.inhatc.persistence.StudentInfoDAO;

//@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class StudentDAOInsertTest {
	@Inject
	private StudentInfoDAO dao;
	
	@Test
	public void insertStudent() throws Exception{
		StudentVO vo = new StudentVO();
		vo.setUserid("201844089");
		vo.setUsername("lkw");
		vo.setAddress("incheon");
		vo.setPhone("010-1234-1234");
		vo.setEmail("abc@def.com");
		dao.insertStudent(vo);
		
		vo.setUserid("201844090");
		vo.setUsername("abc");
		vo.setAddress("incheon");
		vo.setPhone("010-1234-9054");
		vo.setEmail("abc@def2.com");
		dao.insertStudent(vo);
		
		vo.setUserid("201844091");
		vo.setUsername("def");
		vo.setAddress("incheon");
		vo.setPhone("010-2345-1864");
		vo.setEmail("abc@def3.com");
		dao.insertStudent(vo);
	}
}
