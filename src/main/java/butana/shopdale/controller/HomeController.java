package butana.shopdale.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import butana.shopdale.model.Product;
import butana.shopdale.service.HomeService;

@RestController("/")
public class HomeController {

	private final HomeService homeService;

	@Autowired
	public HomeController(HomeService homeService) {
		this.homeService = homeService;
	}

	@GetMapping("/all-products")
	public Map<Object, List<Product>> getAll() {
		return homeService.findAll();
	}

	@PostMapping("/add-product")
	public void addProduct(@RequestBody List<Product> productList) {
		homeService.addProduct(productList);
	}

}
