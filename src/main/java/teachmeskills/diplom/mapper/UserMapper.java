package teachmeskills.diplom.mapper;

import lombok.experimental.UtilityClass;
import teachmeskills.diplom.dto.UserDTO;
import teachmeskills.diplom.entity.User;

@UtilityClass
public class UserMapper {

    public User userToUserDTO(UserDTO userDTO) {
        return User.builder()
                .dateOfBirth(userDTO.getDateOfBirth())
                .email(userDTO.getEmail())
                .firstName(userDTO.getFirstName())
                .lastName(userDTO.getLastName())
                .searchJob(userDTO.isSearchJob())
                .build();
    }

    public UserDTO userDTOtoUser(User user) {
        return UserDTO.builder()
                .dateOfBirth(user.getDateOfBirth())
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .searchJob(user.isSearchJob())
                .build();
    }
}
