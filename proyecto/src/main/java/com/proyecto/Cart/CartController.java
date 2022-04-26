package com.proyecto.Cart;

import com.proyecto.User.User;
import com.proyecto.User.UserRepository;
import java.security.Principal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private CartRepository cartRepo;

    @GetMapping("/cart")
    public String verCart(Model model, Principal User) {
        User user = userRepo.getUserByUsername(User.getName());
        List<CartItem> lista = cartService.cartItems(user);
        model.addAttribute("cartItems", lista);

        float estimatedSubtotal = 0.0f;
        for (CartItem item : lista) {
            estimatedSubtotal += item.getSubtotal();
        }
        model.addAttribute("total", estimatedSubtotal);
        return "cart";
    }

//    @PostMapping("/cart/success")
//    public String addProd(@AuthenticationPrincipal UserDetails user1) {
//        User user = userRepo.getUserByUsername(user1.getUsername());
//        cartRepo.delete;
//        return "item(s) of this product were added to your shopping cart.";
//
//    }

}
