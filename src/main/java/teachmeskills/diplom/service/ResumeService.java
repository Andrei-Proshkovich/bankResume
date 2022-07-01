package teachmeskills.diplom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teachmeskills.diplom.dto.ResumeDTO;
import teachmeskills.diplom.entity.Resume;
import teachmeskills.diplom.exception.EntityNotFoundException;
import teachmeskills.diplom.mapper.ResumeMapper;
import teachmeskills.diplom.repository.ResumeRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ResumeService {

    private final ResumeRepository resumeRepository;

    public List<ResumeDTO> getResumes(){
        return resumeRepository.findAll()
                .stream()
                .map(ResumeMapper::mapToEntity)
                .collect(Collectors.toList());
    }
    public void delete(Long id){
        resumeRepository.deleteById(id);
    }

    public  Resume createResume(ResumeDTO resume) {
       return resumeRepository.save(ResumeMapper.mapToDTO(resume));
    }


    public Resume findByID(long id) throws EntityNotFoundException {
        Optional<Resume> optionalResume = resumeRepository.findById(id);
        Resume resume = null;
        if(optionalResume.isPresent())
            resume = optionalResume.get();
        else throw new EntityNotFoundException();
        return  resume;
    }
}
