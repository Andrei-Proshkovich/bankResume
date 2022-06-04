package teachmeskills.diplom.mapper;


import lombok.experimental.UtilityClass;
import teachmeskills.diplom.dto.CompanyDTO;
import teachmeskills.diplom.entity.Company;

@UtilityClass
public class CompanyMapper {
    public Company companyDtoToCompany(CompanyDTO companyDTO) {
        return Company.builder()
                .nameCompany(companyDTO.getNameCompany())
                .build();
    }


    public CompanyDTO companyToCompanyDto(Company company) {
        return CompanyDTO.builder()
                .nameCompany(company.getNameCompany())
                .build();
    }
}