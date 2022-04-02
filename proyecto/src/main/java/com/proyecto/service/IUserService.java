/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.entity.User;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    public List<User> getAllUser();

    public void createUser(User user);

    public User getUserById(int id);

    public void deleteUser(int id);

    public boolean existeUserById(int id);
}