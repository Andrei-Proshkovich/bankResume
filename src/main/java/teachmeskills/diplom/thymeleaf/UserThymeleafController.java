package teachmeskills.diplom.thymeleaf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import teachmeskills.diplom.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserThymeleafController {

    private static List<UserDTO> users = new ArrayList<UserDTO>();

    @GetMapping(value = { "/ListUsers" })
    public String userList(Model model) {

        model.addAttribute("users", users);

        return "ListUsers";
    }


    @Value("${welcome.message}")
    private String message;

    @Value("${error.message}")
    private String errorMessage;

    @GetMapping(value = { "/", "/index" })
    public String index(Model model) {

        model.addAttribute("message", message);

        return "index";
    }

    @GetMapping(value = { "/ListUsers" })
    public String ListUsers(Model model) {

        model.addAttribute("users", users);

        return "ListUsers";
    }

    @GetMapping(value = { "/addUser" })
    public String showAddPersonPage(Model model) {

        UserDTO userDTO = new UserDTO();
        model.addAttribute("user", userDTO);

        return "addUser";
    }

    @GetMapping(value = { "/addUser" })
    public String saveUser(Model model, //
                             @ModelAttribute("user") UserDTO user) {

        String firstName = user.getFirstName();
        String lastName = user.getLastName();

        if (firstName != null && firstName.length() > 0 //
                && lastName != null && lastName.length() > 0) {
            UserDTO newUser = new UserDTO(firstName, lastName);
            users.add(newUser);

            return "redirect:/ListUsers.html";
        }

        model.addAttribute("errorMessage", errorMessage);
        return "addUser";
    }


}
