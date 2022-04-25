package com.proyecto.Cart;

import com.proyecto.User.User;
import com.proyecto.User.UserRepository;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartRestController {

    @Autowired
    private CartService cartService;
    @Autowired
    private UserRepository userRepo;

    @PostMapping("/cart/add/{id}/{qty}")
    public String addProd(@PathVariable("id") Integer id, @PathVariable("qty") Integer qty, Principal user1) {
        User user = userRepo.getUserByUsername(user1.getName());
        Integer qtyAdded = cartService.addProduct(id, qty, user);
        return qtyAdded + "item(s) of this product were added to your shopping cart.";
    }

}
