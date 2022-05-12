package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.StudentVO;

@Repository
public class StudentInfoDAOImpl implements StudentInfoDAO{

	@Inject
	private SqlSession sqlSession;
	private static final String namespace="StudentInfoMapper";
	@Override
	public void insertStudent(StudentVO vo) throws Exception {
		sqlSession.insert(namespace+".insertStudent",vo);
		
	}
	@Override
	public StudentVO selectStudent(String studentid) throws Exception {
		return sqlSession.selectOne(namespace+".selectStudent",studentid);
	}
	@Override
	public void updateStudent(StudentVO vo) throws Exception {
		sqlSession.update(namespace+".updateStudent",vo);
		
	}
	@Override
	public int listCount() throws Exception {
		return sqlSession.selectOne(namespace+".listCount");
	}
	@Override
	public List<StudentVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".listAll");
	}
	@Override
	public void deleteStudent(String studentid) throws Exception {
		sqlSession.delete(namespace+".deleteStudent",studentid);
		
	}
	

	
}
