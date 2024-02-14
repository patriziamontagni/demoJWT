/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.marconivr.demoJWT.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Patrizia
 */
public interface UserRepository extends JpaRepository<User, Integer>{
    Optional<User> findByEmal(String email);
    
}
