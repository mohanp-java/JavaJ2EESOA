package com.session7;

import java.util.List;

public class TestItem {
    public static void main(String[] args) throws Exception {
        ItemDAO itemDAO = DAOFactory.getItemDAO();
        Item item = new Item(10233, "Fitbit Versa Lite", 14449.99f);
        itemDAO.saveItem(item);
        System.out.println(item);
        System.out.println("**********************");
        itemDAO.updateItem(10233, "Fitbit Charge 2");
        System.out.println("**********************");
        item = new Item(10134, "Fitbit Ionic", 15899.99f);
        itemDAO.saveItem(item);
        System.out.println(item);
        System.out.println("**********************");
        List<Item> items = itemDAO.retrieveItems();
        for(Item i : items) {
            System.out.println(i);
        }
        System.out.println("**********************");
        itemDAO.deleteItem(100);
        System.out.println("**********************");
        ConnectionFactory.closeConnection();
        System.out.println("Close connection....");
    }
}
