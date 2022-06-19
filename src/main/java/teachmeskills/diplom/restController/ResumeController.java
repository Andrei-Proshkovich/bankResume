package teachmeskills.diplom.restController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import teachmeskills.diplom.dto.ResumeDTO;
import teachmeskills.diplom.exception.EntityNotFoundException;
import teachmeskills.diplom.service.ResumeService;

import java.util.List;

@RestController
@RequestMapping("/resume")
@RequiredArgsConstructor
public class ResumeController {

    private final ResumeService resumeService;

    @GetMapping("/resumes")
    public List<ResumeDTO> getResumes(){
        return resumeService.getResumes();
    }


    @DeleteMapping("/id")
    public void delete(@PathVariable("id") Long id) throws EntityNotFoundException {
        resumeService.delete(id);

    }
}
