package teachmeskills.diplom.service;

import teachmeskills.diplom.entity.Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import teachmeskills.diplom.repository.SkillsRepository;

import java.util.Optional;


@Service

public class SkillsService {

   @Autowired
private  SkillsRepository skillsRepository;

//    public SkillsService(SkillsRepository skillsRepository) {
//        this.skillsRepository = skillsRepository;
//    }

    public static void main(String[] args) {
        Skills skills = new Skills(); skills.setNameSkill("ds");
        SkillsService service = new SkillsService();
        service.testRepository();

    }
    @Transactional
    public void testRepository(){
        Optional<Skills> skillsOptional = skillsRepository.findById(1L);
    }
}
