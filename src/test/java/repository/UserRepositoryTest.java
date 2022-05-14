package repository;

import teachmeskills.diplom.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import teachmeskills.diplom.repository.UserRepository;
import teachmeskills.diplom.service.UserService;



@SpringBootTest(classes = {UserRepository.class, UserService.class})


class UserRepositoryTest {


    @Autowired
    private User userService;

    @Autowired
    UserRepository repository;
//    @Test
//
//    public void findByFirstName(){
//
//      userService =  repository.findByFirstName("lol");
//        Assertions.assertNotEquals(userService,);
//    }



}