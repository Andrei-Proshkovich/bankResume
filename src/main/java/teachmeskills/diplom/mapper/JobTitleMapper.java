package teachmeskills.diplom.mapper;

import teachmeskills.diplom.dto.JobTitleDTO;
import teachmeskills.diplom.entity.JobTitle;

public class JobTitleMapper {

    public static JobTitleDTO mapToEntity(JobTitle jobTitle) {
        return JobTitleDTO.builder()
                .id(jobTitle.getId())
                .nameJob(jobTitle.getNameJob())
                .build();
    }

    public JobTitle mapToDTO(JobTitleDTO jobTitleDTO) {
        return JobTitle.builder()
                .nameJob(jobTitleDTO.getNameJob())
                .build();
    }
}
