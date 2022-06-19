package teachmeskills.diplom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teachmeskills.diplom.entity.Address;
import teachmeskills.diplom.repository.AddressRepository;

import java.util.List;
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
}
