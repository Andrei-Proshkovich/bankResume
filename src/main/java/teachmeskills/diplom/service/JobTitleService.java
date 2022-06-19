package teachmeskills.diplom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teachmeskills.diplom.dto.JobTitleDTO;
import teachmeskills.diplom.mapper.JobTitleMapper;
import teachmeskills.diplom.repository.JobTitleRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JobTitleService {

    private final JobTitleRepository jobTitleRepository;

    public List<JobTitleDTO> getAll(){
        return jobTitleRepository.findAll()
                .stream()
                .map(JobTitleMapper::mapToEntity)
                .collect(Collectors.toList());
    }
    public void delete(Long id){
        jobTitleRepository.deleteById(id);
    }


}

