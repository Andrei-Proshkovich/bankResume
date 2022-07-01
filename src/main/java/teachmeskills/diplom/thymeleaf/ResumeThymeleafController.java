package teachmeskills.diplom.thymeleaf;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import teachmeskills.diplom.dto.ResumeDTO;
import teachmeskills.diplom.entity.Resume;
import teachmeskills.diplom.service.ResumeService;

@Controller
@RequiredArgsConstructor
public class ResumeThymeleafController {

    private final ResumeService resumeService;

    @GetMapping("/resumes")
    public String viewHomePageResumes(Model model) {
        model.addAttribute("allResumelist", resumeService.getResumes());
        return "/index";
    }

    @GetMapping("/addnewResume")
    public String addNewResume(Model model) {
       Resume resume = new Resume();
        model.addAttribute("resume", resume);
        return "/newResume";
    }

    @PostMapping("/saveResume")
    public String saveResumes(@ModelAttribute("resume") ResumeDTO resume) {
        resumeService.createResume(resume);
        return "redirect:/resumes";
    }

    @SneakyThrows
    @GetMapping("/showFormForUpdateResumes/{id}")
    public String updateForm(@PathVariable(value = "id") long id, Model model) {
        Resume resume = resumeService.findByID(id);

        model.addAttribute("resume", resume);
        return "/updateResume";
    }

    @GetMapping("/deleteResume/{id}")
    public String deleteThroughId(@PathVariable(value = "id") long id) {
        resumeService.delete(id);
        return "redirect:/resumes";

    }

}
