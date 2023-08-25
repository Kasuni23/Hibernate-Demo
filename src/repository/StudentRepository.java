package repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Entity.StudentEntity;
import Util.sessionFactoryConfiguration;

public class StudentRepository {

    Session session = sessionFactoryConfiguration.getInstance().getSession();

    public Integer saveStudent(StudentEntity studentEntity) {

        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer) session.save(studentEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return -1;
        }

    }

    public StudentEntity getStudent(Integer Id) {
        StudentEntity studentEntity = session.get(StudentEntity.class, Id);
        return studentEntity;
    }

    public void updateStudent(StudentEntity studentEntity) {
        Transaction transaction = session.beginTransaction();
        try {
            session.update(studentEntity);
            transaction.commit();

        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }

    public void deleteStudent(StudentEntity studentEntity) {
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(studentEntity);
            transaction.commit();

        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }

}
