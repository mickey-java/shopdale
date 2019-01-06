package butana.shopdale.service;

import java.util.List;

import org.springframework.stereotype.Service;

import butana.shopdale.model.Product;
import butana.shopdale.repo.HomeRepo;

@Service
public class HomeService {

	private final HomeRepo homeRepo;

	public HomeService(HomeRepo homeRepo) {
		this.homeRepo = homeRepo;
	}

	public Iterable<Product> findAll() {
		return homeRepo.findAll();
	}

	public void addProduct(List<Product> productList) {
		homeRepo.save(productList);
	}

}
