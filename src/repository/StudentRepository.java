package repository;

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
}
