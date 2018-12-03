
package chencj.cc.simple;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import chencj.cc.simple.domain.Student;
import chencj.cc.simple.service.StudentService;
import chencj.cc.simple.service.StudentServiceImpl;
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:bean.xml")
@SpringJUnitConfig(locations="classpath:bean.xml")
public class App {
	@Autowired
	private StudentService studentService;

	@Test
	public void testFindAll() {
		List<Student> list = studentService.findAll();
		for (Student student : list) {
			System.out.println(student);
		}
		
	}
	
	@Test
	public void testSave() {
		Student  student = new Student();
		student.setId(7);
		student.setName("zhaxiang");
		student.setAge(10);
		student.setSex(0);
		studentService.save(student);
		
		
	}
	@Test
	public void testaddMinus() {
		studentService.addMinus(1, 2, 9);
	}
}
