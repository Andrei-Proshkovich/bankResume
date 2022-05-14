package teachmeskills.diplom.service;

import teachmeskills.diplom.entity.JobTitle;
import org.springframework.transaction.annotation.Transactional;
import teachmeskills.diplom.repository.JobTitleRepository;

import java.util.Optional;

public class JobTitleService {

    private JobTitleRepository jobTitleRepository;

    public static void main(String[] args) {

        JobTitleService jobTitleService= new JobTitleService();

        jobTitleService.testRepository();
    }
    @Transactional
    public void testRepository(){
        Optional<JobTitle> skillsOptional = jobTitleRepository.findById(1L);
    }
}
