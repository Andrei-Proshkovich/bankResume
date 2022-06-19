package teachmeskills.diplom.restController;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import teachmeskills.diplom.dto.JobTitleDTO;
import teachmeskills.diplom.service.JobTitleService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/jobtitle")
public class JobTitleController {

    private final JobTitleService jobTitleService;


    @GetMapping("/all")
    public List<JobTitleDTO> getAll(){
        return jobTitleService.getAll();
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public void delete(@PathVariable("id") Long id) {
        jobTitleService.delete(id);
    }
}
