package chencj.cc.simple.service;

import java.io.Serializable;
import java.util.List;

import chencj.cc.simple.domain.Student;

public interface StudentService {

	public void save(Student student);
	public List<Student> findAll();
	public Student findOne(Serializable id);
	public void addMinus(Serializable id1 , Serializable id2,Serializable account);
}
