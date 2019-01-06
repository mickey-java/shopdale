package butana.shopdale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import butana.shopdale.model.Cart;
import butana.shopdale.service.CartService;

@RestController
public class CartController {

	private CartService cartService;

	@Autowired
	public CartController(CartService cartService) {
		this.cartService = cartService;

	}

	@PostMapping("/add/{productId}")
	public void addToCart(@PathVariable(value = "productId") final Integer productId) {
		cartService.addToCart(productId);
	}

	@GetMapping("/all-cartitems")
	public Iterable<Cart> getAllCartItems() {
		return cartService.getAllCartItems();
	}

	@DeleteMapping("/cart/{productId}")
	public Integer deleteCartProduct(@PathVariable(value = "productId") final Integer productId) {
		return cartService.deleteCartProduct(productId);
	}

}
