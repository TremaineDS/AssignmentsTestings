package workassignment;


	import java.util.List;
	import java.util.Scanner;
	
	//client class
	//Assignment 18:  (e-commerce application)  Seller: Add  Products (id,name and price) bean  into HashSet. 
	//Customer: If any products ordered by customer, compare with the data stored and display the total price along with the details of product. 
	//(Use  DAO, bean and client classes)
	public class TheEcommerceApp {

	
		public static void main(String[] args) {
				ISellerDAO IsellerDAO=new Seller();
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the number of product :");
				int noofsellers = scanner.nextInt();

				for(int i =0; i<noofsellers; i++) {
				System.out.println("Enter your ID");
				int id = scanner.nextInt();

				System.out.println("Enter your Name");
				String name = scanner.next();

				System.out.println("Enter your Price");
				double price = scanner.nextInt();

				ISellerDAO seller=new Seller(id, name, price); //creating seller object with constructor injection

				ISellerDAO sel = null;
				 seller.addSeller(seller);   //calling DAO method to add seller object

				}
				scanner.close();
				System.out.println("Successful Product");

				System.out.println("Sellers Data====");
				List<Seller> sellerList = IsellerDAO.findAllSeller();
				for (Seller seller : sellerList) {   //extracting the data from Collection object using for each
					System.out.println(seller.getId()+"\t"+seller.getName()+"\t"+seller.getPrice());


		}


		}
	


	}


