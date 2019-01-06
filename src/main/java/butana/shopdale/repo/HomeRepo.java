package butana.shopdale.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import butana.shopdale.model.Product;

@Component
public interface HomeRepo extends CrudRepository<Product, Integer> {

}
