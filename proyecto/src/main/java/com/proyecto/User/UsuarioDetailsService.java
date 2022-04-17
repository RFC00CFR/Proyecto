package com.proyecto.User;

import com.proyecto.Role.RoleRepository;
import com.proyecto.Role.Role;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        User user = userRepository.getUserByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }

        return new UsuarioDetails(user) {
        };
    }

    public List<User> getAllUser() {
        return (List<User>) userRepository.findAll();
    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    public boolean existeUserById(int id) {
        return userRepository.existsById(id);
    }

    public void defaultRole(User user) {
        Role roleUser = roleRepository.getRoleByName("LEVEL1");
        user.addRole(roleUser);
        userRepository.save(user);
    }

    public List<Role> listRoles() {
        return (List<Role>) roleRepository.findAll();
    }
}
