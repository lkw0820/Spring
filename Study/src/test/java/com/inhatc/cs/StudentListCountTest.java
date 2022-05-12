package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.persistence.StudentInfoDAO;

//@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })


public class StudentListCountTest {
	@Inject
	private StudentInfoDAO dao;
	@Test
	public void listCount() throws Exception{
		System.out.println(dao.listCount());
	}

}
