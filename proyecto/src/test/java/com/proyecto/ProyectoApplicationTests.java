package com.proyecto;

import com.proyecto.Cart.CartItem;
import com.proyecto.Cart.CartRepository;
import com.proyecto.Product.Product;
import com.proyecto.Product.ProductRepository;
import com.proyecto.User.User;
import com.proyecto.User.UserRepository;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class ProyectoApplicationTests {

    @Autowired
    private CartRepository cartRepo;
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private ProductRepository prodRepo;


    @Test
    void contextLoads() {
    }

    @Test
    void test2() {
        User user = userRepo.getById(6);
        Product id = prodRepo.getById(2);

        CartItem item = cartRepo.findByUserAndProduct(user, id);

        assertThat(item).isNull();

    }

//    @Test
//    public void testGetCartItemByUser() {
//        User user = userRepo.getById(6);
//        List< CartItem> carItems = cartRepo.findByUser(user);
//        assertEquals(3, carItems.size());
//    }
//
//    @Test void testUpdateQTY(){
//        Integer id = 1;
//        Integer user_id = 6;
//        Integer cantidad = 6;
//        cartRepo.updateCantidad(cantidad, user_id, id);
//
//    }
//    @Test
//    void testSaveItems() {
//        Integer user_id = 10;
//        Integer id = 1;
//
//        User user = entityManager.find(User.class, user_id);
//        Product product = entityManager.find(Product.class, id);
//
//        CartItem newItem = new CartItem();
//        newItem.setUser(user);
//        newItem.setProduct(product);
//        newItem.setCantidad(1);
//
//        CartItem saveItem = cartRepo.save(newItem);
//
//        assertThat(saveItem.getIdcart());
//
//    }
}
