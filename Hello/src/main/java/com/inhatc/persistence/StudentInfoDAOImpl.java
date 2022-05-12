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
	private static final String namespace = "StudentInfoMapper";

	@Override
	public void insertStudent(StudentVO vo) throws Exception {
		sqlSession.insert(namespace+".insertStudent",vo);
	}

	@Override
	public StudentVO selectStudent(String userid) throws Exception {
		return (StudentVO)sqlSession.selectOne(namespace+".selectStudent",userid);
	}

	@Override
	public void updateStudent(StudentVO vo) throws Exception {
		sqlSession.update(namespace+".updateStudent",vo);
		
	}

	@Override
	public List<StudentVO> listAll() throws Exception {
		return sqlSession.selectList(namespace+".listAll");
	}

	@Override
	public int listCount() throws Exception {
		return sqlSession.selectOne(namespace+".listCount");
	}

	@Override
	public void deleteStudent(String userid) throws Exception {
		sqlSession.delete(namespace+".deleteStudent",userid);
		
	}

	
}
