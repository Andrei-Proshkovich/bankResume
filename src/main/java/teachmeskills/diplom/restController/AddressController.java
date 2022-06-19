package teachmeskills.diplom.restController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import teachmeskills.diplom.entity.Address;
import teachmeskills.diplom.exception.EntityNotFoundException;
import teachmeskills.diplom.service.AddressService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/address")
public class AddressController {

    public final AddressService addressService;
   @GetMapping(value = "/get")
    public List<Address> getAddress(){
        return addressService.getAddresses();
    }
    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable("id") Long id) throws EntityNotFoundException {
        addressService.deleteAddress(id);
    }
}
