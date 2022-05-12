package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;



//@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class BoardDAOUpadateTest {
	@Inject
	private BoardDAO dao;
	
	@Test
	public void update() throws Exception{
		BoardVO vo =new BoardVO();
		vo.setBno(3);
		vo.setTitle("update Title");
		vo.setContent("asd");
		vo.setWriter("lkw");
		dao.update(vo);
	}
}
