package com.ulan;

import java.sql.SQLException;

public class Main {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		BookService service = new BookService();
		Book book = service.createBook(4044L, "H262", "Scifi Book", 12.5f, "1234-5678-5678", 247);
		
	}
}
