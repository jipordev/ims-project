package co.cstad.controller;

import co.cstad.model.StockInDTO;
import co.cstad.service.StockInService;
import co.cstad.service.StockInServiceImpl;

import java.util.Scanner;

public class StockInController {
    private final Scanner scanner ;
    private StockInDTO stockInDTO;
    private StockInService stockInService;
    public StockInController(){
        scanner = new Scanner(System.in);
        stockInDTO = new StockInDTO();
        stockInService = new StockInServiceImpl();
    }
    public void newStock(){
        StockInView.viewCreateStock(stockInDTO,scanner);
        stockInDTO = stockInService.insert(stockInDTO);
        System.out.println(" Successfully saved ");
        System.out.println(stockInDTO);
    }
}
