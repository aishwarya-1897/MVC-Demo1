


package mvc_demo1.dao;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import mvc_demo1.dto.Student;

@Component
public class StudentDao {
	
     EntityManagerFactory factory = Persistence.createEntityManagerFactory("syber");
     EntityManager manager = factory.createEntityManager();
     EntityTransaction transaction = manager.getTransaction();
     
     public void saveStudent(Student student) {
    	 transaction.begin();
    	 manager.persist(student);
    	 transaction.commit();
     }
     public Student getStudent(int id) {
    	 return manager.find(Student.class, id);
     }
     public void updateStudent(Student student) {
    	 transaction.begin();
    	 manager.merge(student);
    	 transaction.commit();
     }
	public List<Student> getAllStudents() {
		Query query = manager.createQuery("select s from Student s");
		List<Student> students = query.getResultList();
		return students;
	}
	public void deleteStudent(int id) {
		transaction.begin();
		manager.remove(manager.find(Student.class, id));
		transaction.commit();
		
	}
	

}
