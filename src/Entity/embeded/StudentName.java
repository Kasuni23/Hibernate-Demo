package Entity.embeded;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Embeddable

public class StudentName {

    // composite attribute

    @Column(name = "first_name", length = 100, nullable = false)
    private String firstname;
    @Column(name = "last_name", length = 100, nullable = false)
    private String lastname;
}
