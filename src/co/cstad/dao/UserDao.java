package co.cstad.dao;

import co.cstad.model.ItemDTO;
import co.cstad.model.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    UserDTO insert(UserDTO userDTO);
    List<UserDTO> select();
    Optional<UserDTO> selectById(Long id);
    UserDTO updateById(UserDTO userDTO);
    UserDTO deleteById(Long id);
    List<UserDTO> selectByName(String name);
}
