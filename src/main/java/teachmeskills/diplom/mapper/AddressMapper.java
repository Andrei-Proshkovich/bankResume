package teachmeskills.diplom.mapper;

import teachmeskills.diplom.dto.AddressDTO;
import teachmeskills.diplom.entity.Address;

public class AddressMapper {

    public Address mapToDTO(AddressDTO addressDTO) {
        return Address.builder()
                .city(addressDTO.getCity())
                .houseNumber(addressDTO.getHouseNumber())
                .street(addressDTO.getStreet())
                .build();
    }

    public AddressDTO mapToEntity(Address address){
        return AddressDTO.builder()
                .city(address.getCity())
                .houseNumber(address.getHouseNumber())
                .street(address.getStreet())
                .build();
    }
}
