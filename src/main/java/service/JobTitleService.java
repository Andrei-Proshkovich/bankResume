package service;

import entity.JobTitle;
import org.springframework.transaction.annotation.Transactional;
import repository.JobTitleRepository;

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
