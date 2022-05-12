package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.MenuVO;

public interface Menu201844089DAO {
	public void insertMenu(MenuVO vo) throws Exception;
	public MenuVO selectMenu(int menuid) throws Exception;
	public void updateMenu(MenuVO vo) throws Exception;
	public void deleteMenu(int menuid) throws Exception;
	public int countMenu() throws Exception;
	public List<MenuVO> listMenu() throws Exception;
}
