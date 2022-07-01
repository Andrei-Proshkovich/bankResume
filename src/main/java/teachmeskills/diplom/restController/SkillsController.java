package teachmeskills.diplom.restController;


import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import teachmeskills.diplom.entity.Skills;
import teachmeskills.diplom.service.SkillsService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/skills")
public class SkillsController {

    public final SkillsService skillsService;

    @GetMapping("/allskills")
    public List<Skills> getSkills(){
        return skillsService.getSkills();
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public void deleteSkills(@PathVariable("id") Long id){
        skillsService.delete(id);
    }
}
