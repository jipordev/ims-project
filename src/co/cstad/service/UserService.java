package co.cstad.service;

import co.cstad.model.ItemDTO;
import co.cstad.model.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO insert(UserDTO userDTO);
    List<UserDTO> select();
    UserDTO selectById(Long id);
    UserDTO updateById(UserDTO userDTO);
    UserDTO deleteById(Long id);
    List<UserDTO> selectByName(String name);
}
