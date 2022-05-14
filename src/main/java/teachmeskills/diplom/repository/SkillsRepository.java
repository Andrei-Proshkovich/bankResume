package teachmeskills.diplom.repository;

import teachmeskills.diplom.entity.Skills;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillsRepository extends CrudRepository<Skills,Long> {

    List<Skills> deleteSkillsById(Long id);
}
