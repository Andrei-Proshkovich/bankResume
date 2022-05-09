package controller;

import entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class UserController {

    UserService userService;
    @GetMapping(value = "/users")
    public ResponseEntity<User> getUsers(){
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }

}
