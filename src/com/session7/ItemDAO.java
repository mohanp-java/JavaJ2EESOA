package com.session7;

import java.sql.SQLException;
import java.util.List;

public interface ItemDAO {
    void saveItem(Item item) throws SQLException;
    void updateItem(int itemId, String itemName) throws SQLException;
    List<Item> retrieveItems() throws SQLException;
    void deleteItem(int itemId) throws SQLException;
}
