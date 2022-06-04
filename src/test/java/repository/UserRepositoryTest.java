//
//package repository;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;
//import teachmeskills.diplom.DiplomApplication;
//import teachmeskills.diplom.entity.User;
//import teachmeskills.diplom.repository.UserRepository;
//
//import java.sql.Date;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
////@SpringBootTest(classes=...)
//@DataJpaTest
//@ContextConfiguration
//@SpringBootTest( SpringBootTest.WebEnvironment.,classes= DiplomApplication.class)
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//class UserRepositoryTest {
//    @Autowired
//    private TestEntityManager entityManager;
//    private UserRepository repository;
//
//    @Test
//    void testExample() throws Exception {
//        this.entityManager.persist(new User(10L, "Tom", "Holland", "tom@holand.com", new Date(11231322L), true));
//        User user = this.repository.findByFirstName("Holland");
//        assertThat(user.getFirstName()).isEqualTo("Holland");
//
//    }
//
//}
//
//
//
//
//
//
//
