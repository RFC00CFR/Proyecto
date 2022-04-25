package com.proyecto.Cart;

import com.proyecto.Product.Product;
import com.proyecto.Product.ProductRepository;
import com.proyecto.User.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepo;

    @Autowired
    private ProductRepository productRepo;

    public List<CartItem> cartItems(User user) {
        return cartRepo.findByUser(user);
    }

    public Integer addProduct(Integer id, Integer cantidad, User user) {
        Integer qtyAdded = cantidad;
        Product product = productRepo.findById(id).get();

        CartItem cartItem = cartRepo.findByUserAndProduct(user, product);
        
        if(product != null){
            qtyAdded = cartItem.getCantidad() + cantidad;
            cartItem.setCantidad(qtyAdded);
        }else{
        cartItem = new CartItem();
        cartItem.setCantidad(cantidad);
        cartItem.setUser(user);
        cartItem.setProduct(product);
        }
        cartRepo.save(cartItem);
        return qtyAdded;
    }
}
