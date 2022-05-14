package teachmeskills.diplom.service;

import teachmeskills.diplom.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teachmeskills.diplom.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service

public class UserService {


    private final UserRepository userRepository;

public List<User>   getUsers(){
    return userRepository.findAll();

}
    public Optional<User> findByID(Long id){
        User user = new User();
       return userRepository.findById(user.getId());
    }
    private     List<User> users;
    UserService userService;


    public void deleteUser(Long id) {

        userRepository.deleteUserById(id);

    }
}