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
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })

public class StudentInsertTest {
	@Inject
	private StudentInfoDAO dao;
	@Test
	public void insertStudent() throws Exception{
		StudentVO vo = new StudentVO();
		vo.setStudentid("201844089");
		vo.setStudentname("lkw");
		vo.setAddress("Incheon");
		vo.setPhone("010-1234-1234");
		vo.setEmail("abc@def.com");
		dao.insertStudent(vo);
	}

}
