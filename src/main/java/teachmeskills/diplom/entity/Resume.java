package teachmeskills.diplom.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "resume",schema = "test")
public class Resume implements Serializable {
    @Serial
    private static final long serialVersionUID = 3921187765696651163L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "path_file")
    private String pathFile;
    @ManyToOne(optional = true)
    @JoinColumn(name = "id",referencedColumnName="id", insertable=false, updatable=false)
    private User user;
}
