package teachmeskills.diplom.thymeleaf;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import teachmeskills.diplom.entity.Skills;
import teachmeskills.diplom.service.SkillsService;

@Controller
@RequiredArgsConstructor
public class SkillsThymeleafController {

    private final SkillsService skillsService;


    @GetMapping(value = "/skills")
    public  String viewHomePageSkills(Model model) {
        model.addAttribute("allSkillslist",skillsService.getSkills());
        return "/index";
    }

    @GetMapping("/addNewSkills")
    public  String addNewSkills(Model model) {
        Skills skills = new Skills();
        model.addAttribute("skills", skills);
        return "/newSkills";
    }

    @PostMapping("/saveSkills")
    public String saveSkills(@ModelAttribute("address") Skills skills) {
        skillsService.save(skills);
        return "redirect:/skills";
    }

    @SneakyThrows
    @GetMapping("/showFormForUpdateSkills/{id}")
    public  String updateForm(@PathVariable(value = "id") long id, Model model) {
        Skills skills = skillsService.findByID(id);
        model.addAttribute("skills", skills);
        return "/updateSkills";
    }

    @GetMapping("/deleteSkills/{id}")
    public  String deleteThroughId(@PathVariable(value = "id") long id) {
        skillsService.delete(id);
        return "redirect:/skills";

    }
}
