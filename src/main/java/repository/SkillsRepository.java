package repository;

import entity.Skills;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillsRepository extends CrudRepository<Skills,Long> {

    List<Skills> deleteSkillsById(Long id);
}
