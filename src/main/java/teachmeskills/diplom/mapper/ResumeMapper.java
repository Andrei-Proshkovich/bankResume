package teachmeskills.diplom.mapper;

import lombok.experimental.UtilityClass;
import teachmeskills.diplom.dto.ResumeDTO;
import teachmeskills.diplom.entity.Resume;

@UtilityClass
public class ResumeMapper {

    public Resume resumeToResumeDTO(ResumeDTO resumeDTO) {
        return Resume.builder()
                .pathFile(resumeDTO.getPathFile())
                .build();
    }

    public ResumeDTO resumeDTOToResume(Resume resume){
        return ResumeDTO.builder()
                .pathFile(resume.getPathFile())
                .build();
    }
}
