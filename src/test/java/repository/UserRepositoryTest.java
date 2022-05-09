package repository;

import entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserRepositoryTest {

@Autowired
private TestEntityManager entityManager;
        

    private UserRepository repository;

    @Test
    void testExample() throws Exception {
//        this.entityManager.persist(new User(1L, "lop", "sda", "232", new Date(1213245), true));
//        User user = this.repository.findByUsername("dsds");
       User user = new User(1L, "lop", "sda", "232", new Date(1213245), true);
        User user2 = new User(2L, "lop", "pop", "era", new Date(12314124L), true);
//        Assertions.assertNotEquals(new User().setFirstName("dsda"), user);
        assertThat(user.getFirstName().equals(user2.getFirstName()));

    }}