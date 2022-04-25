package com.proyecto.Cart;

import com.proyecto.User.User;
import com.proyecto.User.UserRepository;
import java.security.Principal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private UserRepository userRepo;

    @GetMapping("/cart")
    public String verCart(Model model, Principal User) {
        User user = userRepo.getUserByUsername(User.getName());
        List<CartItem> lista = cartService.cartItems(user);
        model.addAttribute("cartItems", lista);
        return "cart";
    }

}
