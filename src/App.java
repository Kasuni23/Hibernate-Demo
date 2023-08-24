
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import Entity.StudentEntity;
import Entity.embeded.StudentName;
import Util.sessionFactoryConfiguration;
import repository.StudentRepository;

public class App {
    public static void main(String[] args) throws Exception {
        // Session s = sessionFactoryConfiguration.getInstance().getSession();

        StudentRepository repo = new StudentRepository();
        StudentEntity entity = new StudentEntity();
        entity.setNic("200152856345");
        StudentName studentName = new StudentName("kaml", "Lahiru");
        entity.setName(studentName);
        List<String> mobiles = new ArrayList<>();
        mobiles.add("0778523695");
        mobiles.add("0778523695");
        entity.setMobiles(mobiles);

        repo.saveStudent(entity);

    }
}
