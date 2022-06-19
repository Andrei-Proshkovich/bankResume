package teachmeskills.diplom.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import teachmeskills.diplom.entity.Skills;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillsRepository extends CrudRepository<Skills,Long> {



@Query("select s from Skills s")
List<Skills> findAll();
    @Transactional
    @Modifying
    @Query("delete from Skills s where s.id = ?1")
    void deleteSkillsById(Long id);
}
