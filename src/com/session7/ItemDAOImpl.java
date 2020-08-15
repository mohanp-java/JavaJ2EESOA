package com.session7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ItemDAOImpl implements ItemDAO{
    private Connection connection;

    private Statement st;

    /**
     * This constructor gets the connection Object from ConnectionFactory and gets connection statement to be used in this class.
     * @throws Exception
     */
    public ItemDAOImpl() throws Exception {
        connection = ConnectionFactory.getConnection();
        st = connection.createStatement();
    }

    /**
     * This method inserts a record into Item table in db
     */
    @Override
    public void saveItem(Item item) throws SQLException {
        st.executeUpdate("insert into items values(" + "'" + item.getItemId() +  "'" + "," +  "'"  + item.getName()  +   "'"  + ","  + "'"  + item.getPrice() +  "'"  + ")");
        System.out.println("Item details saved");
    }

    /**
     * This method updates an item record in db
     */
    @Override
    public void updateItem(int itemId, String itemName)  throws SQLException {
        st.executeUpdate("update items set name="  + "'"   + itemName + "'"  +  " where itemid=" + "'" + itemId + "'");
        System.out.print("Item details updated");
    }

    /**
     * This method retrieves list of items from db
     */
    @Override
    public List<Item> retrieveItems() throws SQLException {
        List<Item> items = new ArrayList<Item>();
        ResultSet resultSet = st.executeQuery("select * from items");
        Item item = null;
        while(resultSet.next()) {
            item = new Item(resultSet.getInt(1), resultSet.getString(2), resultSet.getFloat(3));
            items.add(item);
        }
        return items;
    }

    /**
     * This method deletes an item based on itemid
     */

    @Override
    public void deleteItem(int itemId) throws SQLException {
        st.executeUpdate("delete from items where itemid=" + "'" + itemId + "'");
        System.out.println("Deleted an item");
    }
}
