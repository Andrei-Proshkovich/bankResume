package teachmeskills.diplom.thymeleaf;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import teachmeskills.diplom.entity.Company;
import teachmeskills.diplom.service.CompanyService;

@Controller
@RequiredArgsConstructor
public class CompanyThymeleafController {

    private final CompanyService companyService;


    @GetMapping(value = "/companies")
    public  String viewHomePageCompany(Model model) {
        model.addAttribute("allCompanieslist",companyService.getCompanies());
        return "/index";
    }

    @GetMapping("/addNewCompany")
    public  String addNewCompany(Model model) {
        Company company = new Company();
        model.addAttribute("company", company);
        return "/newCompany";
    }

    @PostMapping("/saveCompany")
    public String saveCompany(@ModelAttribute("company") Company company) {
        companyService.save(company);
        return "redirect:/companies";
    }

    @SneakyThrows
    @GetMapping("/showFormForUpdateCompany/{id}")
    public  String updateForm(@PathVariable(value = "id") long id, Model model) {
        Company company = companyService.findByID(id);
        model.addAttribute("company", company);
        return "/updateCompany";
    }

    @GetMapping("/deleteCompany/{id}")
    public  String deleteThroughId(@PathVariable(value = "id") long id) {
        companyService.deleteCompany(id);
        return "redirect:/companies";

    }
}
