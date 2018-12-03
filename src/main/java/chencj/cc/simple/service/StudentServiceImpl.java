package chencj.cc.simple.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import chencj.cc.simple.dao.StudentDao;

import chencj.cc.simple.domain.Student;
@Transactional
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public void save(Student student) {
		studentDao.save(student);
		
	}

	@Override
	public List<Student> findAll() {
		
		return studentDao.findAll();
	}

	@Override
	public Student findOne(Serializable id) {
		return studentDao.findOne(id);
	}

	@Override
	public void addMinus(Serializable id1, Serializable id2, Serializable account) {
		studentDao.addMinus(id1, id2, account);
		
	}

}
