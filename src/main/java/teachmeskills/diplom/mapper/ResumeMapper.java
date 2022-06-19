package teachmeskills.diplom.mapper;

import lombok.experimental.UtilityClass;
import teachmeskills.diplom.dto.ResumeDTO;
import teachmeskills.diplom.entity.Resume;

@UtilityClass
public class ResumeMapper {

    public Resume mapToDTO(ResumeDTO resumeDTO) {
        return Resume.builder()
                .pathFile(resumeDTO.getPathFile())
                .build();
    }

    public ResumeDTO mapToEntity(Resume resume){
        return ResumeDTO.builder()
                .id(resume.getId())
                .pathFile(resume.getPathFile())
                .build();
    }
}
