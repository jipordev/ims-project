package co.cstad.view;

import co.cstad.controller.ItemController;
import co.cstad.model.ItemDTO;

import java.util.List;

import static java.lang.System.out;

public class ItemView {
    public static void printItemList(List<ItemDTO> itemDTOList) {
        if (itemDTOList == null) {
            out.println("Item list is null.");
            return;
        }

        out.println("Item List");
        itemDTOList.forEach(itemDTO -> {
            out.println("=".repeat(20));
            out.println("ID : " + itemDTO.getItemId());
            out.println("CODE : " + itemDTO.getItemCode());
            out.println("DESCRIPTION : " + itemDTO.getItemDescription());
            out.println("UNIT : " + itemDTO.getItemUnit());
            out.println("QTY : " + itemDTO.getQty());
            out.println("PRICE A : " + itemDTO.getItemPrice_out_a());
            out.println("PRICE B : " + itemDTO.getItemPrice_out_b());
            out.println("PRICE C : " + itemDTO.getItemPrice_out_c());
            out.println("STATUS : " + itemDTO.getStatus());
            out.println("=".repeat(20));
        });
    }
}
