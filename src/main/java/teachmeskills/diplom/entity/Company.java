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
@Table(name = "company",schema = "test")
public class Company implements Serializable {
    @Serial
    private static final long serialVersionUID = 1190602106213810667L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_company")
    private String nameCompany;
    @ManyToOne
    @JoinColumn(name = "id",referencedColumnName="id", insertable=false, updatable=false)
    private JobTitle jobTitle;
    @ManyToOne
    @JoinColumn(name = "id",referencedColumnName="id", insertable=false, updatable=false)
    private Address address;
}
