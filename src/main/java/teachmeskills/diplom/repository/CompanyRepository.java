package teachmeskills.diplom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import teachmeskills.diplom.entity.Company;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    @Query("select c from Company c")
    List<Company> findAll();

    @Query("delete from Company c where c.id = ?1")
    @Transactional
    @Modifying
    @Override
    void deleteById(Long aLong);
}
