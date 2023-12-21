package workassignment;

import java.util.List;
		//Assignment 18:  (e-commerce application)  Seller: Add  Products (id,name and price) bean  into HashSet. 
		//Customer: If any products ordered by customer, compare with the data stored and display the total price along with the details of product. 
		//(Use  DAO, bean and client classes)
		public interface ISellerDAO {

			Seller addSeller(Seller seller);
			Seller findSellerId(int id);
			List<Seller>findAllSeller();

		
	}

