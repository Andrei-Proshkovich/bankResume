package entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@Builder
@Entity
@Table(name = "skills",schema = "test")
@NoArgsConstructor
@AllArgsConstructor

//@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
public class Skills  implements Serializable {

    @Serial
    private static final long serialVersionUID = -4840152481243246485L;

   
   @ManyToOne
   @JoinColumn(name = "id")
   private User user;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_skill")
    private String nameSkill;
    @Column(name = "work_experience")
    private BigDecimal workExperience;

    @Override
    public String toString() {
        return "Skills{" +
                "id=" + id +
                ", nameSkill='" + nameSkill + '\'' +
                ", workExperience=" + workExperience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skills skills = (Skills) o;
        return id.equals(skills.id) && Objects.equals(nameSkill, skills.nameSkill) && Objects.equals(workExperience, skills.workExperience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameSkill, workExperience);
    }
}
