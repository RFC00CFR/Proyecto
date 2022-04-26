package com.proyecto.Cart;

import com.proyecto.Product.Product;
import com.proyecto.User.User;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cart")
public class CartItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer idcart;

    @ManyToOne
    @JoinColumn(name = "id")
    @Getter
    @Setter
    private Product product;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Getter
    @Setter
    private User user;

    @Getter
    @Setter
    private int cantidad;

    public CartItem( Product product, User user, int cantidad) {
        this.product = product;
        this.user = user;
        this.cantidad = cantidad;
    }

    public CartItem() {
    }
    
    @Transient
    public float getSubtotal(){
        return product.getPrecio() * cantidad;
    }

    
    
}
