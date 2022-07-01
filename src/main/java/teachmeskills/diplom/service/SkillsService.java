package teachmeskills.diplom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teachmeskills.diplom.entity.Skills;
import teachmeskills.diplom.exception.EntityNotFoundException;
import teachmeskills.diplom.repository.SkillsRepository;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class SkillsService {


private final SkillsRepository skillsRepository;

   public List<Skills> getSkills(){
      return skillsRepository.findAll();
   }

   public void delete(Long id){
      skillsRepository.deleteSkillsById(id);
   }

    public void save(Skills skills) {
       skillsRepository.save(skills);
    }

    public Skills findByID(long id) throws EntityNotFoundException {
     Optional<Skills> skillsOptional = skillsRepository.findById(id);
     Skills skills = null;
     if (skillsOptional.isPresent())
         skills = skillsOptional.get();
     else throw new EntityNotFoundException();
     return skills;
    }


}
