package Entity;

import java.util.List;
import java.util.Date;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import Entity.embeded.StudentName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class StudentEntity {

    // id attribute
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // attribute | derived attribute

    @Column(name = "nic", nullable = false)
    private String nic;

    // composite attribute
    private StudentName name;

    // mulitivalue attribute

    @ElementCollection
    @CollectionTable(name = "Student_mobiles", joinColumns = @JoinColumn(name = "student_id"))
    private List<String> mobiles;

    @CreationTimestamp
    @Column(name = "create_date", nullable = false)
    private Date createDate;

}
