package com.proyecto.Cart;

import com.proyecto.Product.Product;
import com.proyecto.User.User;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<CartItem, Integer> {

    public List<CartItem> findByUser(User user);

    public CartItem findByUserAndProduct(User user, Product product);
    
    @Transactional
    @Modifying
    @Query("UPDATE CartItem u SET u.cantidad = ?1 WHERE u.user.user_id =?2 AND u.product.id = ?3")
    public void updateCantidad(Integer qty, Integer user_id,Integer id);
    
    @Transactional
    @Modifying
    @Query("DELETE CartItem u WHERE u.user.user_id =?1 AND u.product.id = ?2")
    public void deleteByUserAndProduct(Integer user_id,Integer id);
    
  

//    @Query("DELETE CartItem u WHERE u.user.user_id = :id")
//    public void deleteByUser((@Param("id") Integer ida);
    

}
