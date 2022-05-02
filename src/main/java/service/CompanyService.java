package service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.CompanyRepository;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private CompanyRepository companyRepository;



}
