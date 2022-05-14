package controller;

import entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class UserController {

    private final UserService userService;
    @GetMapping(value = "/users")
    public List<User> getUsers(){
        return (List<User>) userService.getUsers();
    }
       @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }


}
