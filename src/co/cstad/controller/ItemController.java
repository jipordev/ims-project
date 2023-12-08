package co.cstad.controller;

import co.cstad.dao.ItemDaoImpl;
import co.cstad.model.ItemDTO;
import co.cstad.service.ItemService;
import co.cstad.service.ItemServiceImpl;
import co.cstad.view.ItemView;

import java.util.List;

public class ItemController {
    private static ItemDTO itemDTO;
    private final ItemService itemService;
    public ItemController() {
        itemDTO = new ItemDTO();
        itemService= new ItemServiceImpl();
    }

    public void index() {
        List<ItemDTO> itemDTOList = itemService.select();
        ItemView.printItemList(itemDTOList);
    }
}
