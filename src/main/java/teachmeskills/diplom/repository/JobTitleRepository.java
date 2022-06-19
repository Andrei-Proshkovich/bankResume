package teachmeskills.diplom.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import teachmeskills.diplom.entity.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle,Long> {
    @Query("select j from JobTitle j")
    @Override
    List<JobTitle> findAll();

    @Transactional
    @Modifying
    @Query("delete from JobTitle j where j.id = ?1")
    void deleteById(Long id);
}
