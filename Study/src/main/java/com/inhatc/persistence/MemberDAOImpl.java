package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.inhatc.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.inhatc.mappers.memberMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember",vo);
	}

	@Override
	public MemberVO readMember(String userid) {
		return sqlSession.selectOne(namespace+".readMember",userid);
	}

	@Override
	public MemberVO readMemberWitPw(String userid, String userpw) {
		Map<String,Object> parmMap = new HashMap<String,Object>();
		parmMap.put("userid", userid);
		parmMap.put("userpw", userpw);
		return sqlSession.selectOne(namespace+".readMemberWithPw",parmMap);
	}

	@Override
	public void updateMember(MemberVO vo) {
		sqlSession.update(namespace+".updateMember",vo);
		
	}

	@Override
	public int listCount() {
		return (int)sqlSession.selectOne(namespace+".listCount");
	}

	@Override
	public List<MemberVO> listAll() {
		return sqlSession.selectList(namespace+".listAll");
	}

	@Override
	public void deleteMember(String userid) {
		sqlSession.delete(namespace+".deleteMember",userid);
		
	}
	
}
