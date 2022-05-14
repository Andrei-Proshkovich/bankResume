package teachmeskills.diplom.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JobTitleDTO {
    private Long id;
    private String nameJob;
}
