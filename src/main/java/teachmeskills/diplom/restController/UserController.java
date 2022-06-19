package teachmeskills.diplom.restController;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import teachmeskills.diplom.dto.UserDTO;
import teachmeskills.diplom.entity.User;
import teachmeskills.diplom.service.UserService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserController {

    public final UserService userService;

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

    @SneakyThrows
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);

    }


}
