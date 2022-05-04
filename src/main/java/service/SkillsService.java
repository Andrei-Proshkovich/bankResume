package service;

import entity.Skills;
import org.springframework.stereotype.Service;
import repository.SkillsRepository;


@Service

public class SkillsService {

private final SkillsRepository skillsRepository;

    public SkillsService(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

    public static void main(String[] args) {
        Skills skills = new Skills(); skills.setNameSkill("ds");
        SkillsService service = null;
        service.skillsRepository.save(skills);

    }
}
