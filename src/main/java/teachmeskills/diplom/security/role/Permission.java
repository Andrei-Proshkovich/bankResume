package teachmeskills.diplom.security.role;

import lombok.Getter;

@Getter
public enum Permission {
    USERS_WRITE("users:write"),
    USERS_READ("users:read");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }
}
