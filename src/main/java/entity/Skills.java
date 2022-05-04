package entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor

//@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_skill")
    private String nameSkill;
    @Column(name = "work_experience")
    private BigDecimal workExperience;


}
