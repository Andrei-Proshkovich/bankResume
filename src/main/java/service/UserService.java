package service;

import entity.User;
import lombok.RequiredArgsConstructor;
import repository.UserRepository;

import java.util.List;

@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
        List<User> users;
    UserService userService;


    public List<User> users (List<User>){
        userRepository.findAll(users);
    }


}
