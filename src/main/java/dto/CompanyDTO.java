package dto;


import entity.JobTitle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyDTO {
    private Long id;
    private String nameCompany;
    private JobTitle jobTitle;
}
