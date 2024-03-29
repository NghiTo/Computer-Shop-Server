package Computer.Shop.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto
{
    private Long id;
    private String name;
    private String username;
    private String password;
    private String email;
}
