package teachmeskills.diplom.thymeleaf;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import teachmeskills.diplom.entity.Address;
import teachmeskills.diplom.repository.AddressRepository;
import teachmeskills.diplom.service.AddressService;

@Controller
@RequiredArgsConstructor
public class AddressThymeleafController {

    private final AddressService addressService;
    private final AddressRepository addressRepository;


    @GetMapping(value = "/addresses")
    public  String viewHomePageAddresses(Model model) {
        model.addAttribute("allAddresslist",addressService.getAddresses());
        return "/index";
    }

    @GetMapping("/addNewAddress")
    public  String addNewAddress(Model model) {
        Address address = new Address();
       model.addAttribute("address", address);
        return "/newAddress";
    }

    @PostMapping("/saveAddress")
    public String saveAddress(@ModelAttribute("address") Address address) {
        addressService.save(address);
        return "redirect:/";
    }

    @SneakyThrows
    @GetMapping("/showFormForUpdateAddress/{id}")
    public  String updateForm(@PathVariable(value = "id") long id, Model model) {
        Address address = addressService.findByID(id);
        model.addAttribute("address", address);
        return "/updateAddress";
    }

    @GetMapping("/deleteAddress/{id}")
    public  String deleteThroughId(@PathVariable(value = "id") long id) {
        addressService.deleteAddress(id);
          return "redirect:/addresses";

    }

}
