package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDTO {
    private Long id;

    private String city;

    private String street;

    private int houseNumber;
}
