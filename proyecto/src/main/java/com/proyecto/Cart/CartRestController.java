package com.proyecto.Cart;

import com.proyecto.User.User;
import com.proyecto.User.UserRepository;
import com.proyecto.User.UsuarioDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
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
    public String addProd(@PathVariable("id") Integer id, @PathVariable("qty") Integer qty, @AuthenticationPrincipal UserDetails user1) {
        User user = userRepo.getUserByUsername(user1.getUsername());

        cartService.addProduct(id, qty, user);
        return "item(s) of this product were added to your shopping cart.";

    }

//    @PostMapping("/cart/update/{id}/{qty}")
//    public String updateProd(@PathVariable("id") Integer id, @PathVariable("qty") Integer qty, @AuthenticationPrincipal UserDetails user1) {
//        User user = userRepo.getUserByUsername(user1.getUsername());
//        float subtotal = cartService.
//        cartService.addProduct(id, qty, user);
//        return "item(s) of this product were added to your shopping cart.";
//
//    }

}
