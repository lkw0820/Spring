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

public class StudentDAOSelectTest {
	@Inject
	private StudentInfoDAO dao;
	
	private StudentVO vo;
	@Test
	public void selectStudent() throws Exception{
		String userid ="201844089";
		System.out.println(dao.selectStudent("201844090"));
		vo=dao.selectStudent("201844090");
		System.out.println("이름: "+vo.getUsername());
		System.out.println("주소: "+vo.getAddress());
		System.out.println("폰: "+vo.getPhone());
		System.out.println("email: "+vo.getEmail());
	}
	
}
