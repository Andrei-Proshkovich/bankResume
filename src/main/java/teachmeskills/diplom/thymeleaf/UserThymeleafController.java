package teachmeskills.diplom.thymeleaf;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import teachmeskills.diplom.entity.User;
import teachmeskills.diplom.service.UserService;

@Controller
@RequiredArgsConstructor
public class UserThymeleafController {

    private final UserService userService;


    @GetMapping("/")
    public String viewHomePageUsers(Model model) {
        model.addAttribute("allUserlist", userService.getUsers());
        return "/index";
    }

    @GetMapping("/addnew")
    public String addNewUsers(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "/newUser";
    }

    @PostMapping("/save")
    public String saveUsers(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/";
    }

    @SneakyThrows
    @GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") long id, Model model) {
        User user = userService.findByID(id);
        model.addAttribute("user", user);
        return "/updateUser";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteThroughId(@PathVariable(value = "id") long id) {
        userService.deleteUser(id);
        return "redirect:/";

    }


}
