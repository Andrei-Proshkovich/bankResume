package service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import teachmeskills.diplom.DiplomApplication;
import teachmeskills.diplom.entity.User;
import teachmeskills.diplom.repository.UserRepository;
import teachmeskills.diplom.service.UserService;

import java.sql.Date;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DiplomApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application.properties")
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class UserServiceIntegrationTest {
    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        User tom = new User(15L, "To", "Holland", "tom@holand.com", new Date(123144124L), true);

        Mockito.when(userRepository.findByFirstName(tom.getFirstName()))
                .thenReturn(tom);
        Mockito.when(userRepository.findByLastName(tom.getLastName()))
                .thenReturn(tom);
    }

    @Test
    @DisplayName("FindByFirstName")
    public void whenValidFirstName_thenUserShouldBeFound() {
        String firstName = "Tom";
        User found = userService.getUserByFirstName(firstName);

        assertThat(found.getFirstName())
                .isEqualTo(firstName);
    }

    @Test
    @DisplayName("FindByLastName")
    public void whenValidLastName_thenUserShouldBeFound() {
        String lastName = "Holland";
        User found = userService.getUserByLastName(lastName);

        assertThat(found.getLastName())
                .isEqualTo(lastName);
    }
}