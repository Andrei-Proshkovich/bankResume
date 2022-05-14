package teachmeskills.diplom.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;


@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "address",schema = "test")
public class Address implements Serializable {
    @Serial
    private static final long serialVersionUID = -6156081153727438695L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    @Column(name = "city")
    private String city;
    @Column(name = "street")
    private String street;
    @Column(name = "house_number")
    private int houseNumber;
    @ManyToOne(optional = true)
    @JoinColumn(name = "id",referencedColumnName="id", insertable=false, updatable=false)
    private User user;
    @ManyToOne(optional = true)
    @JoinColumn(name = "id",referencedColumnName="id", insertable=false, updatable=false)
    private Company company;

}
