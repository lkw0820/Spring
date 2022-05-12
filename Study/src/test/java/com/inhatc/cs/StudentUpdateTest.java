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

public class StudentUpdateTest {
	@Inject
	private StudentInfoDAO dao;
	@Test
	public void updateStudent() throws Exception{
		StudentVO vo = new StudentVO();
		vo.setStudentid("201844089");
		vo.setStudentname("up lkw");
		vo.setAddress("up Incheon");
		vo.setPhone("up 010-1234-1234");
		vo.setEmail("up abc@def.com");
		dao.updateStudent(vo);
	}

}
