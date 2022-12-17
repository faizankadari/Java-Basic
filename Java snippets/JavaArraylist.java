package Stream;

import java.util.*;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class JavaArraylist {
	public static void main(String[] args) {
		List<Product> itemslist = new ArrayList<Product>();
		// Adding Products
		itemslist.add(new Product(1, "Samsung ", 45000f));
		itemslist.add(new Product(2, "Realme ", 30000f));
		itemslist.add(new Product(3, "Redmi ", 28000f));
		itemslist.add(new Product(4, "Vivo ", 28000f));
		itemslist.add(new Product(5, "Apple ", 90000f));
		List<Float> list1 = itemslist.stream().filter(p -> p.price > 30000).map(p -> p.price)
				.collect(Collectors.toList());
		System.out.println(list1);
		// It will give maximum and minimum price

		Product item1 = itemslist.stream().max((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
		System.out.println("Costly Smart Phone is " + item1.name + "for $" + item1.price);
		// It will give name & price of max price

		Product item2 = itemslist.stream().min((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
		System.out.println("Cheapest Smart Phone is " + item2.name + "for $" + item2.price);
		// It will give name & price of min price

		Map<Integer, String> productPriceMap = itemslist.stream()
				.collect(Collectors.toMap(p -> p.id, p -> p.name + "Smart Phone"));
		System.out.println(productPriceMap);
		// It will give list of id & name of product

		Map<Object, Object> p2 = itemslist.stream().collect(Collectors.toMap(p -> p.name, p -> p.price));
		System.out.println(p2);
		// It will give list of name & price of product

	}
}
