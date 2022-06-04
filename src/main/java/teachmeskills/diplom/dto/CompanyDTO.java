package teachmeskills.diplom.dto;


import lombok.Data;
import teachmeskills.diplom.entity.JobTitle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CompanyDTO {
    private Long id;
    private String nameCompany;
    private JobTitle jobTitle;
}
