package com.inhatc.service;

import java.util.List;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Criteria;


public interface BoardService {
	
	public void regist(BoardVO vo) throws Exception;
	public BoardVO read(Integer bno) throws Exception;
	public void modify(BoardVO vo) throws Exception;
	public void remove(Integer bno) throws Exception;
	public List<BoardVO> listAll() throws Exception;
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	public int listCountCriteria(Criteria cri) throws Exception;

}
