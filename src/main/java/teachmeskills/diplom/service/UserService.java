package teachmeskills.diplom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teachmeskills.diplom.dto.UserDTO;
import teachmeskills.diplom.entity.User;
import teachmeskills.diplom.exception.EntityNotFoundException;
import teachmeskills.diplom.mapper.UserMapper;
import teachmeskills.diplom.repository.UserRepository;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private     List<User> users;
    UserService userService;

    public List<User>   getUsers(){
    return userRepository.findAll();

}
public User createUser(UserDTO userDTO){
    return userRepository.save(UserMapper.mapToDTO(userDTO));
}

public List<User> findByLastName(String lastName){
   return  userRepository.searchAllByLastName(lastName);
}

    public User findByID(Long id) throws EntityNotFoundException {
        Optional<User> optionalUser = userRepository.findById(id);
        User user = null;
        if (optionalUser.isPresent())
            user = optionalUser.get();
        else
            throw new EntityNotFoundException();
        return user;
    }


    public void deleteUser(Long id) {

        userRepository.deleteUserById(id);

    }

    public User getUserByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }
    public User getUserByLastName(String lastName) {
        return userRepository.findByLastName(lastName);
    }

    public void save(User user) {
        userRepository.save(user);
    }
}
