package teachmeskills.diplom.mapper;

import teachmeskills.diplom.dto.JobTitleDTO;
import teachmeskills.diplom.entity.JobTitle;

public class JobTitleMapper {

    public JobTitleDTO jobTitleDtoToJobTitle(JobTitle jobTitle) {
        return JobTitleDTO.builder()
                .nameJob(jobTitle.getNameJob())
                .build();
    }

    public JobTitle jobTitleToJobTitleDto(JobTitleDTO jobTitleDTO) {
        return JobTitle.builder()
                .nameJob(jobTitleDTO.getNameJob())
                .build();
    }
}
