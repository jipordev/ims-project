package co.cstad.service;

import co.cstad.dao.ItemDaoImpl;
import co.cstad.dao.UserDaoImpl;
import co.cstad.model.UserDTO;
import co.cstad.util.Singleton;

import java.security.Signature;
import java.util.List;

public class UserServiceImpl implements UserService{
    private final UserDaoImpl userDao;
    public UserServiceImpl(){
        userDao = Singleton.getUserDao();
    }
    @Override
    public UserDTO insert(UserDTO userDTO) {
        return userDao.insert(userDTO);
    }

    @Override
    public List<UserDTO> select() {
        return userDao.select();
    }

    @Override
    public UserDTO selectById(Long id) {

        return userDao.selectById(id).orElse(null);
    }

    @Override
    public UserDTO updateById(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO deleteById(Long id) {
        return userDao.deleteById(id);
    }

    @Override
    public List<UserDTO> selectByName(String name) {
        return null;
    }
}
