package co.cstad.service.serviceimplementation;

import co.cstad.dao.CustomerDao;
import co.cstad.dao.daoimplementation.CustomerDaoImpl;
import co.cstad.model.CustomerDTO;
import co.cstad.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao;
    public CustomerServiceImpl() {
        customerDao = new CustomerDaoImpl();
    }

    @Override
    public CustomerDTO insert(CustomerDTO customerDTO) {
        return customerDao.insert(customerDTO);
    }

    @Override
    public List<CustomerDTO> select() {
        return customerDao.select();
    }

    @Override
    public CustomerDTO selectById(Long id) {
        return customerDao.selectById(id).orElse(null);
    }

    @Override
    public CustomerDTO updateById(CustomerDTO customerDTO) {
        return customerDao.updateById(customerDTO);
    }

    @Override
    public CustomerDTO deleteById(Long id) {
        return customerDao.deleteById(id);
    }

    @Override
    public List<CustomerDTO> selectByName(String name) {
        return null;
    }
}
