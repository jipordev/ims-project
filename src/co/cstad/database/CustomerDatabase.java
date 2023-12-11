package co.cstad.database;

import co.cstad.model.CustomerDTO;

import java.util.ArrayList;
import java.util.List;

public class CustomerDatabase {
    private final List<CustomerDTO> customerDTOList;
    public CustomerDatabase() {
        customerDTOList = new ArrayList<>();
    }

    public List<CustomerDTO> getCustomerDTOList() {
        return customerDTOList;
    }
}
