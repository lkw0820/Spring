package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.StudentVO;

public interface StudentInfoDAO {
	public void insertStudent(StudentVO vo) throws Exception;
	public StudentVO selectStudent(String studentid) throws Exception;
	public void updateStudent(StudentVO vo) throws Exception;
	public int listCount() throws Exception;
	public List<StudentVO> listAll() throws Exception;
	public void deleteStudent(String studentid) throws Exception;

}
