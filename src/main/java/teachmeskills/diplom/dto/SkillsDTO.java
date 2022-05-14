package teachmeskills.diplom.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SkillsDTO {
    private Long id;
    private String nameSkill;
    private BigDecimal workExperience;
}
