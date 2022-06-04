package teachmeskills.diplom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import teachmeskills.diplom.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> deleteByLastName(String lastName);

    @Query("select u from User u where u.firstName = ?1")

    User findByFirstName(@Param("firstName")String firstName);

    @Query("select u from User u")
    @Override
    List<User> findAll();


    @Query(value = "delete from User u where u.id = ?1")
    void deleteUserById(Long id);


@Modifying
@Transactional
    @Query("select u from User u where u.lastName = ?1")
    User findByLastName(@Param("lastName")String lastName);
    List<User> searchAllByFirstName(String firstName);
    List<User> searchAllByLastName(String lastName);
}
