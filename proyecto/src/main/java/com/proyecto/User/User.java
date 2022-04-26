package com.proyecto.User;

import com.proyecto.Role.Role;
import java.io.Serializable;
import java.util.*;

import javax.persistence.*;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int user_id;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private boolean enabled;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String surname;

    @Getter
    @Setter
    private String secondsurname;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String telephone;

    @Getter
    @Setter
    private String inscription;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();


    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void addRole(Role role) {
        this.roles.add(role);
    }

    public String getLista() {
        ArrayList<Role> lista = new ArrayList<>();

        String s = "";
        for (Role a : roles) {
            s += a.getName() + "\n";
        }
        return s;
    }

    public User() {
    }

    public User(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "User{" + "user_id=" + user_id + ", username=" + username + ", enabled=" + enabled + ", name=" + name + ", surname=" + surname + ", secondsurname=" + secondsurname + ", email=" + email + ", telephone=" + telephone + ", inscription=" + inscription + '}';
    }

    


    
}
