package teachmeskills.diplom.mapper;

import lombok.experimental.UtilityClass;
import teachmeskills.diplom.dto.SkillsDTO;
import teachmeskills.diplom.entity.Skills;

@UtilityClass
public class SkillsMapper {

    public Skills mapToDTO(SkillsDTO skillsDTO) {
        return Skills.builder()
                .nameSkill(skillsDTO.getNameSkill())
                .workExperience(skillsDTO.getWorkExperience())
                .build();
    }

    public SkillsDTO mapToEntity(Skills skills){
        return SkillsDTO.builder()
                .nameSkill(skills.getNameSkill())
                .workExperience(skills.getWorkExperience())
                .build();
    }
}
