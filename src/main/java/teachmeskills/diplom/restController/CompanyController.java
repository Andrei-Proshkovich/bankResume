package teachmeskills.diplom.restController;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import teachmeskills.diplom.exception.EntityNotFoundException;
import teachmeskills.diplom.service.CompanyService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {
   public final CompanyService companyService;
      @GetMapping("/companies")
    public ModelAndView getCompany(Model model){
        model.addAttribute("companies", companyService.getCompanies());
        return new ModelAndView("companies");
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) throws EntityNotFoundException {
          companyService.deleteCompany(id);
    }
}
