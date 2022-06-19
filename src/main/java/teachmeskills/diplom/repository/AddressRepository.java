package teachmeskills.diplom.repository;



import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import teachmeskills.diplom.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    @Transactional
    @Modifying
    @Query("delete from Address a where a.id = ?1")
    void deleteById(Long id);

    @Query("select a from Address a")
    @Override
    List<Address> findAll();
}
