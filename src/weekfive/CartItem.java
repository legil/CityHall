package weekfive;

import java.util.HashMap;
import java.util.Scanner;

public class CartItem {

	String item_name;
	int item_quantity;

	public CartItem(String item_name, int item_quantity) {
		this.item_name = item_name;
		this.item_quantity = item_quantity;
	}
	public boolean add(HashMap<String, Integer> cart, CartItem item) {
		if(!cart.containsKey(item)){
			cart.put(item.item_name, 1);
		}
		else {
			item_quantity = cart.get(item) + item_quantity;
			cart.put(item.item_name, item_quantity);
		}

		return cart.containsKey(item.item_name);
	}
	

	public static void main(String[] args) {
		HashMap<String, Integer> cart = new HashMap<String, Integer>();
		System.out.println();
		
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter (item, quantity) or exit");
			String item = input.nextLine().replaceAll("\\s",""); //stops at exit-out of bounds
			
			String itemName = item.substring(0, item.indexOf(','));
			int itemQuantity = Integer.parseInt(item.substring(item.indexOf(",")+1));
			CartItem article = new CartItem(itemName, itemQuantity);
			boolean added = article.add(cart, article);
			System.out.println("Item added: " + added);
			article.add(cart, new CartItem("apple", 4));
			article.add(cart, new CartItem("apple", 2));
			
			System.out.println(cart);
			
		
		input.close();
	}
}

