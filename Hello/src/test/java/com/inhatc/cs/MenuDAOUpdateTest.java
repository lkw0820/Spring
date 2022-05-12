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


public class MenuDAOUpdateTest {
	@Inject
	private Menu201844089DAO dao;
	@Test
	public void updateMenu() throws Exception{
		MenuVO vo = new MenuVO();
		vo.setMenuid(2);
		vo.setMenu("update 중식");
		vo.setMenuname("update 자장면");
		vo.setPrice(15000);
		dao.updateMenu(vo);
		

	}

}
