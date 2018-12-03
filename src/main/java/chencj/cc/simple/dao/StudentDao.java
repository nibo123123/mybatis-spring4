package chencj.cc.simple.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import chencj.cc.simple.domain.Student;
@Repository
public interface StudentDao {

	public void save(Student student);
	public List<Student> findAll();
	public Student findOne(Serializable id);
	public void addMinus(Serializable id1 , Serializable id2,Serializable account);
}
