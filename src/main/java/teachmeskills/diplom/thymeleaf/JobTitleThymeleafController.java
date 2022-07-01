package teachmeskills.diplom.thymeleaf;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import teachmeskills.diplom.entity.JobTitle;
import teachmeskills.diplom.service.JobTitleService;

@Controller
@RequiredArgsConstructor
public class JobTitleThymeleafController {
    private final JobTitleService jobTitleService;


    @GetMapping(value = "/jobtitles")
    public  String viewHomePageJobTittles(Model model) {
        model.addAttribute("allJobTitleslist",jobTitleService.getAll());
        return "/index";
    }

    @GetMapping("/addNewJobTitle")
    public  String addNewJobTitles(Model model) {
        JobTitle jobTitle = new JobTitle();
        model.addAttribute("jobTitle", jobTitle);
        return "/newJobTitle";
    }

    @PostMapping("/saveJobTitle")
    public String saveJobTitle(@ModelAttribute("jobTitle") JobTitle jobTitle) {
       jobTitleService.save(jobTitle);
        return "redirect:/jobtitles";
    }

    @SneakyThrows
    @GetMapping("/showFormForUpdateJobTitle/{id}")
    public  String updateForm(@PathVariable(value = "id") long id, Model model) {
        JobTitle jobTitle = jobTitleService.findByID(id);
        model.addAttribute("jobTitle", jobTitle);
        return "/updateJobTitle";
    }

    @GetMapping("/deleteJobTitle/{id}")
    public  String deleteThroughId(@PathVariable(value = "id") long id) {
        jobTitleService.delete(id);
        return "redirect:/jobtitles";

    }
}
