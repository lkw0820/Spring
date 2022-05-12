package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.MenuVO;
import com.inhatc.persistence.Menu201844089DAO;
import com.inhatc.persistence.StudentInfoDAO;

//@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})


public class MenuDAOInsertTest {
	@Inject
	private Menu201844089DAO dao;
	@Test
	public void insertMenu() throws Exception{
		MenuVO vo = new MenuVO();
		vo.setMenuid(1);
		vo.setMenu("한식");
		vo.setMenuname("비빔밥");
		vo.setPrice(10000);
		dao.insertMenu(vo);
		
		vo.setMenuid(2);
		vo.setMenu("중식");
		vo.setMenuname("자장면");
		vo.setPrice(7000);
		dao.insertMenu(vo);
		
		vo.setMenuid(3);
		vo.setMenu("일식");
		vo.setMenuname("라면");
		vo.setPrice(9000);
		dao.insertMenu(vo);
	}

}
