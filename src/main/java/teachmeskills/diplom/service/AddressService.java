package teachmeskills.diplom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teachmeskills.diplom.entity.Address;
import teachmeskills.diplom.exception.EntityNotFoundException;
import teachmeskills.diplom.repository.AddressRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressService {

    public final AddressRepository addressRepository;
    public List<Address> getAddresses() {
        return addressRepository.findAll();
    }


    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }

    public void save(Address address) {
        addressRepository.save(address);
    }

    public Address findByID(long id) throws EntityNotFoundException {
       Optional<Address> addressOptional = addressRepository.findById(id);
       Address address = null;
       if (addressOptional.isPresent())
           address = addressOptional.get();
       else
           throw new EntityNotFoundException();
       return address;

    }

}
