package com.proyecto.Cart;

import com.proyecto.Product.Product;
import com.proyecto.User.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<CartItem, Integer> {

    public List<CartItem> findByUser(User user);

    public CartItem findByUserAndProduct(User user, Product product);

}
