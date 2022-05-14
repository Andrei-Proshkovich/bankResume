package teachmeskills.diplom.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResumeDTO {
    private Long id;
    private String pathFile;
}
