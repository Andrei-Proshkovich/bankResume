package teachmeskills.diplom.repository;



import teachmeskills.diplom.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    @Override
    void deleteById(Long aLong);
}