package co.cstad.dao.daoimplementation;

import co.cstad.dao.InvoiceDao;
import co.cstad.model.CustomerDTO;
import co.cstad.model.InvoiceDTO;
import co.cstad.model.ItemDTO;
import co.cstad.util.DbSingleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InvoiceDaoImpl implements InvoiceDao {

    private final Connection connection;
    public InvoiceDaoImpl(){
        connection = DbSingleton.instance();
    }

    @Override
    public InvoiceDTO insert(InvoiceDTO invoice) {
        return null;
    }

//    @Override
//    public List<InvoiceDTO> select() {
//        List<InvoiceDTO> invoices = new ArrayList<>();
//
//        try (Connection con = ConnectionFactory.getConnection()) {
//            String sql = "SELECT * FROM invoice";
//            try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
//                while (rs.next()) {
//                    InvoiceDTO invoice = mapResultSetToInvoice(rs);
//                    invoices.add(invoice);
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return invoices;
//    }
public List<InvoiceDTO> select() {
    String sql = "SELECT * FROM invoice";
    try {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<InvoiceDTO> invoiceDTOS = new ArrayList<>();
        while (resultSet.next()) {
            InvoiceDTO invoiceDTO = new InvoiceDTO();
            invoiceDTO.setInvoiceId(resultSet.getLong("invoice_id"));
            invoiceDTO.setInvoiceNo(resultSet.getString("invoice_no"));
            invoiceDTO.setDiscount(resultSet.getBigDecimal("discount"));
            invoiceDTO.setCancelled(resultSet.getBoolean("is_cancelled"));
            invoiceDTO.setPaid(resultSet.getBoolean("is_paid"));

            // Handle customer_id
            Long customerId = resultSet.getLong("customer_id");
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setCustomersId(customerId);
            invoiceDTO.setCustomer(customerDTO);

            invoiceDTO.setStatus(resultSet.getBoolean("status"));
            invoiceDTOS.add(invoiceDTO);
        }
        return invoiceDTOS;
    } catch (SQLException e) {
        // Handle the exception appropriately (e.g., log it or throw a custom exception)
        throw new RuntimeException("Error fetching invoices from the database", e);
    }
}


    @Override
    public Optional<InvoiceDTO> selectById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<InvoiceDTO> selectByNo(String invoiceNo) {
        return null;
    }

    @Override
    public InvoiceDTO updateById(InvoiceDTO invoice) {
        return null;
    }

    @Override
    public InvoiceDTO deleteById(Long id) {
        return null;
    }
}
