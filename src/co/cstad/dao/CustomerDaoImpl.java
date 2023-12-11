package co.cstad.dao;

import co.cstad.model.CustomerDTO;

import java.util.List;
import java.util.Optional;

public class CustomerDaoImpl implements CustomerDao{
    @Override
    public CustomerDTO insert(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public List<CustomerDTO> select() {
        return null;
    }

    @Override
    public Optional<CustomerDTO> selectById(Long id) {
        return Optional.empty();
    }

    @Override
    public CustomerDTO updateById(CustomerDTO product) {
        return null;
    }

    @Override
    public CustomerDTO deleteById(Long id) {
        return null;
    }

    @Override
    public List<CustomerDTO> selectByName(String name) {
        return null;
    }
}
