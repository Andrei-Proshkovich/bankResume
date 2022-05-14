package teachmeskills.diplom.repository;

import teachmeskills.diplom.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> deleteByLastName(String lastName);
List<User> findAll();
    @Transactional
    @Modifying
    @Query(value = "delete from User u where u.id = ?1")
    void deleteUserById(Long id);

    User findByFirstName(String firstname);
}
