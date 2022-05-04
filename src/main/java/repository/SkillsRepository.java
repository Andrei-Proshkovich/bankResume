package repository;

import entity.Skills;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends CrudRepository<Skills,Long> {

    Skills save(Skills skills);
}
