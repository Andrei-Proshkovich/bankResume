package teachmeskills.diplom.restController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import teachmeskills.diplom.dto.UserDTO;
import teachmeskills.diplom.entity.User;
import teachmeskills.diplom.service.UserService;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserController {

    public final UserService userService;
    private final List<User> USERS = Stream.of(
            new User(10L, "Tom", "Holland", "tom@holand.com", new Date(11231322L), true),
            new User(11L, "John", "Dep", "john@dep.com", new Date(112313256L), true),
            new User(12L, "Adam", "Draiver", "adam@driver.com", new Date(1123132567L), true)
    ).collect(Collectors.toList());

    @GetMapping(value = {"/lastName"})
    public List<User> findUserByLastName() {
        return userService.findByLastName("Lol");
    }

    @PostMapping("/usercreate")
    public User createUser(UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @GetMapping(value = {"/users"})
    public List<User> getUsers() {
        return userService.getUsers();

    }
    @GetMapping(value = {"/users2"})
    public List<User> getAllUsers() {
        return USERS.stream().toList();

    }

    @PostMapping
    public User create(@RequestBody User user){
    this.USERS.add(user);
    return user;
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Long id) {
        return USERS.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id){
        this.USERS.removeIf(user -> user.getId().equals(id));
    }
//    @SneakyThrows
//    @DeleteMapping("/{id}")
//    public void deleteUser(@PathVariable("id") Long id) {
//        userService.deleteUser(id);
//    }


}
