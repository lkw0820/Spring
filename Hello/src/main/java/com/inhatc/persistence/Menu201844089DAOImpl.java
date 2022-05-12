package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.MenuVO;

@Repository
public class Menu201844089DAOImpl implements Menu201844089DAO{
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "Menu201844089Mapper";
	
	@Override
	public void insertMenu(MenuVO vo) throws Exception {
		sqlSession.insert(namespace+".insertMenu",vo);
		
	}
	@Override
	public MenuVO selectMenu(int menuid) throws Exception {
		return sqlSession.selectOne(namespace+".selectMenu",menuid);
	}
	@Override
	public void updateMenu(MenuVO vo) throws Exception {
		sqlSession.update(namespace+".updateMenu",vo);
		
	}
	@Override
	public void deleteMenu(int menuid) throws Exception {
		sqlSession.delete(namespace+".deleteMenu",menuid);
		
	}
	@Override
	public int countMenu() throws Exception {
		return sqlSession.selectOne(namespace+".countMenu");
	}
	@Override
	public List<MenuVO> listMenu() throws Exception {
		return sqlSession.selectList(namespace+".listMenu");
	}
	

}
