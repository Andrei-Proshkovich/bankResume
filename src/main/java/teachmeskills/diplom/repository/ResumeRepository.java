package teachmeskills.diplom.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import teachmeskills.diplom.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResumeRepository  extends JpaRepository<Resume,Long> {

    @Query("select r from Resume r")
    @Override
    List<Resume> findAll();

    @Query("delete from Resume r where r.id = ?1")
    @Transactional
    @Modifying
    @Override
    void deleteById(Long aLong);
}
