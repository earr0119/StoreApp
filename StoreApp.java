package storage;
import java.util.Scanner;


public class StoreApp {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int options = 0;
		Store store = new Store();


		System.out.println("******************************************************");
		System.out.println("****************Welcome to StoreApp*******************");
		System.out.println("******************************************************\n");
			do {

				System.out.println("Please, Select an option: ");
				System.out.println("1) Add Products: ");
				System.out.println("2) Products details: ");
				System.out.println("3) Search Product by Code: ");
				System.out.println("4) Exit");
				
				options = Integer.parseInt(in.nextLine());
				
				switch (options) {
				case 1:
					System.out.println("Please, Write Products' Code: ");
					int code = Integer.parseInt(in.nextLine());
					
					System.out.println("Please, Write Products' Name: ");
					String name = in.nextLine();
					
					System.out.println("Please, Write Products' Size: ");
					String size = in.nextLine();
					
					System.out.println("Please, Write Products' Price: ");
					int price = Integer.parseInt(in.nextLine());
					
					System.out.println("Please, Write Products' Stock: ");
					int stock = Integer.parseInt(in.nextLine());
					
					System.out.println("Please, Write Products' Brand: ");
					String brand = in.nextLine();
					
					Products producto = new Products(code, name, size, price, stock, brand);
					store.addProduct(producto);
					
					break;
				case 2:
					store.putProductsIn();
					break;
				case 3:
					System.out.println("Please, Write the Code You are looking for: ");
					int code2 = Integer.parseInt(in.nextLine());
					
					Products p = store.searchCode(code2);
					
					if(p == null) {
						System.out.println("Error, That Code does not exist");
					} else {
						System.out.println("I found your Product");
						System.out.println(p.toString());
					}
					break;
					
				case 4:
					break;
				}

				}while(options != 4);
		

	}

}
