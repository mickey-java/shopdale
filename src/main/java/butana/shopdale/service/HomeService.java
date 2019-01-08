package butana.shopdale.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import butana.shopdale.model.Product;
import butana.shopdale.repo.HomeRepo;

@Service
public class HomeService {

	private final HomeRepo homeRepo;

	public HomeService(HomeRepo homeRepo) {
		this.homeRepo = homeRepo;
	}

	public Map<Object, List<Product>> findAll() {

		List<Product> productList = homeRepo.findAll();

		return productList.stream()
		    .collect(Collectors.groupingBy(Product::getType));
	}

	public void addProduct(List<Product> productList) {
		homeRepo.save(productList);
	}

}
