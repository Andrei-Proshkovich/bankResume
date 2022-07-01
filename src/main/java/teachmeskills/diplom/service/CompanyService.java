package teachmeskills.diplom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teachmeskills.diplom.entity.Company;
import teachmeskills.diplom.exception.EntityNotFoundException;
import teachmeskills.diplom.repository.CompanyRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;


    public List<Company> getCompanies() {
        return companyRepository.findAll();
    }

    public void deleteCompany(Long id){
        companyRepository.deleteById(id);
    }

    public void save(Company company) {
       companyRepository.save(company);
    }

    public Company findByID(Long id) throws EntityNotFoundException {
        Optional<Company> optionalCompany = companyRepository.findById(id);
        Company company = null;
        if (optionalCompany.isPresent())
            company = optionalCompany.get();
        else throw new EntityNotFoundException();
        return company;
    }

}
