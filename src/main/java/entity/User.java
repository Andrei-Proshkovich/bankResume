package entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@Table(name = "users", schema = "test")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "date_of-birth")
    private Date dateOfBirth;
    @Column(name = "search_job")
    private boolean searchJob;


}
