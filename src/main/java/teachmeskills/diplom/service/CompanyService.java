package teachmeskills.diplom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teachmeskills.diplom.dto.CompanyDTO;
import teachmeskills.diplom.mapper.CompanyMapper;
import teachmeskills.diplom.repository.CompanyRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;


    public List<CompanyDTO> getCompanies() {
        return companyRepository.findAll()
                .stream()
                .map(CompanyMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    public void deleteCompany(Long id){
        companyRepository.deleteById(id);
    }
}
