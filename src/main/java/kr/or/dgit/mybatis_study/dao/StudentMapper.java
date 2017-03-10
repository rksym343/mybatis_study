package kr.or.dgit.mybatis_study.dao;

import java.util.List;

import kr.or.dgit.mybatis_study.dto.Student;

public interface StudentMapper {
	int insertStudent(Student student);
	int insertStudentWithPhone(Student student); //typeHandler 예제
	List<Student> selectStudentByAll();
	
	// 과제 test까지 완료~ 깃허브 올리고~ 브랜치 이용해서 해야함다~
	Student selectStudentByNo(int studNo);
	int updateStudent(Student student);
	int deleteStudentByNo(int StudNo);
	
}
