package co.cstad.dao;

import co.cstad.model.CustomerDTO;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    CustomerDTO insert(CustomerDTO customerDTO);
    List<CustomerDTO> select();
    Optional<CustomerDTO> selectById(Long id);
    CustomerDTO updateById(CustomerDTO product);
    CustomerDTO deleteById(Long id);
    List<CustomerDTO> selectByName(String name);
}