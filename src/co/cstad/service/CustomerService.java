package co.cstad.service;

import co.cstad.model.CustomerDTO;

import java.util.List;

public interface CustomerService {
    CustomerDTO insert(CustomerDTO customerDTO);
    List<CustomerDTO> select();
    CustomerDTO selectById(Long id);
    CustomerDTO updateById(CustomerDTO customerDTO);
    CustomerDTO deleteById(Long id);
    List<CustomerDTO> selectByName(String name);
}