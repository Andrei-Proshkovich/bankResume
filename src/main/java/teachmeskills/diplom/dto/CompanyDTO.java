package teachmeskills.diplom.dto;


import teachmeskills.diplom.entity.JobTitle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyDTO {
    private Long id;
    private String nameCompany;
    private JobTitle jobTitle;
}
