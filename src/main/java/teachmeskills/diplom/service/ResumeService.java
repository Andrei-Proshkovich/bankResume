package teachmeskills.diplom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teachmeskills.diplom.dto.ResumeDTO;
import teachmeskills.diplom.mapper.ResumeMapper;
import teachmeskills.diplom.repository.ResumeRepository;

import java.util.List;
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
}
