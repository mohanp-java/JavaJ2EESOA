package com.session7;

public class DAOFactory {
	
	private static ItemDAO itemDAO = null;
	
	public static ItemDAO getItemDAO() throws Exception {
		if(itemDAO == null) 
			itemDAO = new ItemDAOImpl();
		
		return itemDAO;
	}
}
