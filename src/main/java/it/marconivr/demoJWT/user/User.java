/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.marconivr.demoJWT.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Patrizia
 */

@Data       //genera tutti i metodi getters, setters, toString(), hashCode(), equals(), ...
            //equivale a: @Getter, @Setter, ecc
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
