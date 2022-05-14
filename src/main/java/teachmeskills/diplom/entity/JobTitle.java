package teachmeskills.diplom.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_title",schema = "test")
public class JobTitle implements Serializable {
    @Serial
    private static final long serialVersionUID = 221135084475938351L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_job")
    private String nameJob;



}
