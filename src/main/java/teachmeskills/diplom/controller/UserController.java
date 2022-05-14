package teachmeskills.diplom.controller;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;
import teachmeskills.diplom.entity.User;
import teachmeskills.diplom.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class UserController {

    public final UserService userService;




    @GetMapping(value = "/users")
    public List<User> getUsers(){
        return userService.getUsers();

    }
       @SneakyThrows
       @DeleteMapping("/{id}")

    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }


}
