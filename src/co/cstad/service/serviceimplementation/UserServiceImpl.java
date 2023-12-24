package co.cstad.service.serviceimplementation;

import co.cstad.dao.daoimplementation.UserDaoImpl;
import co.cstad.model.UserDTO;
import co.cstad.service.UserService;
import co.cstad.util.Singleton;

import java.util.List;

public class UserServiceImpl implements UserService {
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
        return userDao.updateById(userDTO);
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
