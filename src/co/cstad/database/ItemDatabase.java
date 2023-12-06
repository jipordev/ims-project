package co.cstad.database;

import co.cstad.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDatabase {
    private final List<Item> items;
    public ItemDatabase() {
        items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }
}
