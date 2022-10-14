package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.jdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"ıphone xr", 900);
		
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger()};
		 
		ProductManager productManager = new ProductManager(new jdbcProductDao(), loggers);
		productManager.add(product1);

	}

}