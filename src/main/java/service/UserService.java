package service;

import entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {


    private final UserRepository userRepository;

public User getUsers(){
    return (User) userRepository.findAll();
}
    public void findByID(Long id){
        User user = new User();
        userRepository.findById(user.getId());
    }
    private     List<User> users;
    UserService userService;





}
