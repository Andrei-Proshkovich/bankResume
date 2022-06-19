package teachmeskills.diplom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teachmeskills.diplom.dto.UserDTO;
import teachmeskills.diplom.entity.User;
import teachmeskills.diplom.mapper.UserMapper;
import teachmeskills.diplom.repository.UserRepository;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User>   getUsers(){
    return userRepository.findAll();

}
public User createUser(UserDTO userDTO){
    return userRepository.save(UserMapper.mapToDTO(userDTO));
}

public List<User> findByLastName(String lastName){
   return  userRepository.searchAllByLastName(lastName);
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

    public User getUserByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }
    public User getUserByLastName(String lastName) {
        return userRepository.findByLastName(lastName);
    }
}
