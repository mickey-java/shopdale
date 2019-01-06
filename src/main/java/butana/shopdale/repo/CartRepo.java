package butana.shopdale.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import butana.shopdale.model.Cart;

@Component
public interface CartRepo extends CrudRepository<Cart, Integer> {

	@Transactional
	@Modifying
	@Query(value = "delete from butana.shopdale.model.Cart where productId=:pId")
	public Integer deleteByproductId(@Param(value = "pId") Integer productId);

}
