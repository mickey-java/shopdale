package butana.shopdale;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import butana.shopdale.model.Product;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Integer a = 10;
		Integer b = 40;

		Map<String, String> myMap = new HashMap<>();

		myMap.put("k1", "v1");
		myMap.put("k1", "v1");
		myMap.put("k1", "v1");

		List<Product> productList = Arrays.asList(new Product(1, "s1", "Shirt", 1.0f),
		    new Product(2, "h1", "Hoodie", 2.0f),
		    new Product(3, "S2", "Shirt", 4.0f),
		    new Product(4, "h2", "Hoodie", 6.0f));

		Map<String, List<Product>> x = productList.stream()
		    .collect(Collectors.groupingBy(Product::getType));
//		
//		"Type: T-Shirt --items"
//		"superwomand, price: 100"
//		"ironman, price: 40"
//		"Type: Hoodie --items"
//		"h1, price: 100"
//		"h2, price: 40"

		// System.out.println(x);

		x.forEach((k, v) -> {
			System.out.println(k);
			v.forEach(val -> {
				System.out.println(val.getName() + " price:" + val.getPrice());
			});

		});

	}

	static Integer getSum(Integer a, Integer b) throws InterruptedException {

		Thread.sleep(3000);

		return a + b;
	}

}
