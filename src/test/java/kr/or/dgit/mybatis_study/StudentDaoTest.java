package kr.or.dgit.mybatis_study;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_study.dto.PhoneNumber;
import kr.or.dgit.mybatis_study.dto.Student;
import kr.or.dgit.mybatis_study.service.StudentService;

public class StudentDaoTest {
	private static StudentService studentService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = StudentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	@Test
	public void testSelectStudentByAll() {
		List<Student> lists = studentService.selectStudentByAll();
		for(Student s : lists){
			System.out.println(s);
		}
		Assert.assertNotNull(lists);
	}
	
	/*@Test
	public void testInsertStudent() {
		Student std = new Student(6, "조시은", "jsw@test.co.kr", new Date());
		int res = studentService.insertStudent(std);
		Assert.assertEquals(1, res);
	}*/
	
	/*@Test
	public void testinsertStudentWithPhone() {
		Student std = new Student(7, "금토끼", "ktk@test.co.kr", new Date(), new PhoneNumber("010-1234-1234"));
		int res = studentService.insertStudentWithPhone(std);
		Assert.assertEquals(1, res);
	}*/
	
	@Test
	public void selectStudentByNo() {
		Student student = studentService.selectStudentByNo(5);
		Assert.assertNotNull(student);
	}
	
	@Test
	public void updateStudent() {
		Student std = new Student(3, "수정수정", "jsw@test.co.kr", new Date(), new PhoneNumber("011-1111-1111"));
		int res = studentService.updateStudent(std);
		Assert.assertEquals(1, res);
	}
	
	/*@Test
	public void deleteStudentByNo() {
		int res = studentService.deleteStudentByNo(6);
		Assert.assertEquals(1, res);
	}
*/
}
