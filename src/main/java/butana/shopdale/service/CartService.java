package butana.shopdale.service;

import org.springframework.stereotype.Service;

import butana.shopdale.model.Cart;
import butana.shopdale.repo.CartRepo;

@Service
public class CartService {

	private CartRepo cartRepo;

	public CartService(CartRepo cartRepo) {
		this.cartRepo = cartRepo;
	}

	public void addToCart(Integer productId) {

		Cart cart = new Cart();
		cart.setProductId(productId);
		cartRepo.save(cart);

	}

	public Iterable<Cart> getAllCartItems() {
		return cartRepo.findAll();
	}

	public Integer deleteCartProduct(Integer productId) {
		return cartRepo.deleteByproductId(productId);

	}

}
