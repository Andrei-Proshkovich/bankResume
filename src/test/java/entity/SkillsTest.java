package entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkillsTest {

    @Test
    void setNameSkill() {
        Skills box =new Skills();
        box.setNameSkill("box");
        Assertions.assertEquals(box,"box");
    }

    @Test
    void setWorkExperience() {
    }
}