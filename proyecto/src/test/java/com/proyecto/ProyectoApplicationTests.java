package com.proyecto;

import com.proyecto.Cart.CartItem;
import com.proyecto.Cart.CartRepository;
import com.proyecto.User.User;
import com.proyecto.User.UserRepository;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProyectoApplicationTests {

    @Autowired
    CartRepository cartRepo;
    @Autowired
    UserRepository userRepo;

    @Test
    void contextLoads() {
    }

    @Test
    public void testGetCartItemByUser() {
        User user = userRepo.getById(6);
        List< CartItem> carItems = cartRepo.findByUser(user);
        assertEquals(3, carItems.size());
    }

}
